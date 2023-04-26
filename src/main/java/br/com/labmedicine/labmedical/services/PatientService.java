package br.com.labmedicine.labmedical.services;

import br.com.labmedicine.labmedical.dto.request.PatientRequest;
import br.com.labmedicine.labmedical.dto.response.PatientResponse;
import br.com.labmedicine.labmedical.exceptions.PatientConflitExeception;
import br.com.labmedicine.labmedical.exceptions.PatientNotFoundExeception;
import br.com.labmedicine.labmedical.exceptions.UserExeception;
import br.com.labmedicine.labmedical.mappers.PatientMapper;
import br.com.labmedicine.labmedical.repositories.ConsultRepository;
import br.com.labmedicine.labmedical.repositories.ExamRepository;
import br.com.labmedicine.labmedical.repositories.PatientRepository;
import br.com.labmedicine.labmedical.models.Patient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class PatientService {

  private final PatientRepository patientRepository;
  private final ExamRepository examRepository;
  private final ConsultRepository consultRepository;

  private String MSG_NOT_FOUND = "Nenhum Registro Encontrado com o id: ";

  public PatientService(PatientRepository patientRepository, ExamRepository examRepository, ConsultRepository consultRepository) {
    this.patientRepository = patientRepository;
    this.examRepository = examRepository;
    this.consultRepository = consultRepository;
  }

  public ResponseEntity<Object> getAll(){

    return ResponseEntity.status(HttpStatus.OK).body(
            this.patientRepository.findAll().stream()
                    .map(PatientMapper.INSTANCE::patientToPatResponse
                    ));

  }

  @Transactional
  public ResponseEntity<PatientResponse> save(PatientRequest patientRequest){

    this.patientRepository.findByCpf(patientRequest.getCpf()).map(user -> {
      throw new PatientConflitExeception("Cpf Ja Cadastrado");
    });

    Patient patient = PatientMapper.INSTANCE.reqtoPatient(patientRequest);
    Patient newPatient = this.patientRepository.save(patient);

    return ResponseEntity.status(HttpStatus.CREATED).body(PatientMapper.INSTANCE.patientToPatResponse(newPatient));
  }

  public ResponseEntity<Optional<PatientResponse>> getById(String id){

    return ResponseEntity.status(HttpStatus.OK).body(
            Optional.ofNullable(
                    this.patientRepository.findById(id)
                            .map(PatientMapper.INSTANCE::patientToPatResponse)
                            .orElseThrow(() -> new PatientNotFoundExeception(MSG_NOT_FOUND+id))
            )
    );

  }

  @Transactional
  public ResponseEntity<Optional<PatientResponse>> update(String id, PatientRequest patientRequest){

    return  ResponseEntity.status(HttpStatus.OK).body(
            Optional.ofNullable(
                    this.patientRepository.findById(id)
                            .map(s -> {

                              Patient patient = PatientMapper.INSTANCE.reqtoPatient(patientRequest);
                              patient.setId(id);
                              Patient newPatient = this.patientRepository.save(patient);
                              return PatientMapper.INSTANCE.patientToPatResponse(newPatient);

                            })
                            .orElseThrow(() -> new PatientNotFoundExeception(MSG_NOT_FOUND+id)))
    );

  }

  @Transactional
  public ResponseEntity<Object> deleteById(String id)  {

    if(this.consultRepository.existsById(id) || this.examRepository.existsByPatientId(id)){
      throw new UserExeception("Paciente possui Exame/ Consulta Cadastrada");
    }

    return this.patientRepository.findById(id)
            .map( user -> {

              this.patientRepository.deleteById(user.getId());
              return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);

            }).orElseThrow(() -> new PatientNotFoundExeception(MSG_NOT_FOUND+id));

  }

}
