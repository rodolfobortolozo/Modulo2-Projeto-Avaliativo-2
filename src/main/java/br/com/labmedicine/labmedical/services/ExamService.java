package br.com.labmedicine.labmedical.services;

import br.com.labmedicine.labmedical.dto.request.ExamRequest;
import br.com.labmedicine.labmedical.dto.response.ExamResponse;
import br.com.labmedicine.labmedical.exceptions.ConsultExeception;
import br.com.labmedicine.labmedical.helpers.IsValidPatient;
import br.com.labmedicine.labmedical.helpers.IsValidUser;
import br.com.labmedicine.labmedical.mappers.ExamMapper;
import br.com.labmedicine.labmedical.models.Exam;
import br.com.labmedicine.labmedical.models.Patient;
import br.com.labmedicine.labmedical.models.User;
import br.com.labmedicine.labmedical.repositories.ExamRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ExamService {

  private final ExamRepository examRepository;
  private final IsValidUser isValidUser;
  private final IsValidPatient isValidPatient;

  public ExamService(ExamRepository examRepository, IsValidUser isValidUser, IsValidPatient isValidPatient) {
    this.examRepository = examRepository;
    this.isValidUser = isValidUser;
    this.isValidPatient = isValidPatient;
  }

  public ResponseEntity<Object> getAll(){

    return ResponseEntity.status(HttpStatus.OK).body(

            this.examRepository.findAll().stream()
                    .map(ExamMapper.INSTANCE::examToExamResponse
                    ));

  }

  @Transactional
  public ResponseEntity<ExamResponse> save(ExamRequest examRequest){

    User user = this.isValidUser.isValid(examRequest.getIddoctor());
    Patient patient = this.isValidPatient.isValid(examRequest.getIdpatient());

    Exam exam = ExamMapper.INSTANCE.reqtoExam(examRequest);
    exam.setPatient(patient);
    exam.setUser(user);
    Exam newExam = this.examRepository.save(exam);

    return ResponseEntity.status(HttpStatus.CREATED).body(ExamMapper.INSTANCE.examToExamResponse(newExam));
  }

  public ResponseEntity<Optional<ExamResponse>> getById(String id){

    return ResponseEntity.status(HttpStatus.OK).body(
            Optional.ofNullable(
                    this.examRepository.findById(id)
                            .map(ExamMapper.INSTANCE::examToExamResponse)
                            .orElseThrow(() -> new ConsultExeception("Nenhum Registro Encontrado."))
            )
    );

  }

  @Transactional
  public ResponseEntity<Optional<ExamResponse>> update(String id, ExamRequest examRequest){

    User user = this.isValidUser.isValid(examRequest.getIddoctor());
    Patient patient = this.isValidPatient.isValid(examRequest.getIdpatient());

    return  ResponseEntity.status(HttpStatus.OK).body(
            Optional.ofNullable(
                    this.examRepository.findById(id)
                            .map(exam -> {

                              Exam updateExam = ExamMapper.INSTANCE.reqtoExam(examRequest);
                              updateExam.setId(id);
                              updateExam.setPatient(patient);
                              updateExam.setUser(user);
                              Exam newExam = this.examRepository.save(updateExam);
                              return ExamMapper.INSTANCE.examToExamResponse(newExam);

                            })
                            .orElseThrow(() -> new ConsultExeception("Nenhum Registro Encontrado."))
            )
    );

  }

  @Transactional
  public ResponseEntity<Object> deleteById(String id)  {

    return this.examRepository.findById(id)
            .map( consult -> {

              this.examRepository.deleteById(consult.getId());
              return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);

            }).orElseThrow(() -> new ConsultExeception("Nenhum Registro Encontrado."));

  }

  public ResponseEntity<List<ExamResponse>> getByPatientId(String id){

    isValidPatient.isValid(id);

    return ResponseEntity.status(HttpStatus.OK).body(
                    this.examRepository.findByPatientId(id).stream()
                            .map(ExamMapper.INSTANCE::examToExamResponse).toList());

  }
}
