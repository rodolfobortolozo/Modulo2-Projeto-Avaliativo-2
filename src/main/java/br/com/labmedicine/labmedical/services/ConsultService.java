package br.com.labmedicine.labmedical.services;

import br.com.labmedicine.labmedical.dto.request.ConsultRequest;
import br.com.labmedicine.labmedical.dto.response.ConsultResponse;
import br.com.labmedicine.labmedical.exceptions.ConsultExeception;
import br.com.labmedicine.labmedical.helpers.IsValidPatient;
import br.com.labmedicine.labmedical.helpers.IsValidUser;
import br.com.labmedicine.labmedical.mappers.ConsultMapper;
import br.com.labmedicine.labmedical.models.Consult;
import br.com.labmedicine.labmedical.models.Patient;
import br.com.labmedicine.labmedical.models.User;
import br.com.labmedicine.labmedical.repositories.ConsultRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ConsultService {

  private final ConsultRepository consultRepository;
  private final IsValidUser isValidUser;
  private final IsValidPatient isValidPatient;

  public ConsultService(ConsultRepository consultRepository, IsValidUser isValidUser, IsValidPatient isValidPatient) {
    this.consultRepository = consultRepository;
    this.isValidUser = isValidUser;
    this.isValidPatient = isValidPatient;
  }

  public ResponseEntity<Object> getAll(){

    return ResponseEntity.status(HttpStatus.OK).body(
            this.consultRepository.findAll().stream()
                    .map(ConsultMapper.INSTANCE::consultToConResponse
                    ));

  }

  @Transactional
  public ResponseEntity<ConsultResponse> save(ConsultRequest consultRequest){

    User user = this.isValidUser.isValid(consultRequest.getIddoctor());
    Patient patient = this.isValidPatient.isValid(consultRequest.getIdpatient());

    Consult consult = ConsultMapper.INSTANCE.reqtoConsult(consultRequest);
    consult.setPatient(patient);
    consult.setUser(user);
    Consult newConsult = this.consultRepository.save(consult);

    return ResponseEntity.status(HttpStatus.CREATED).body(ConsultMapper.INSTANCE.consultToConResponse(newConsult));
  }

  public ResponseEntity<Optional<ConsultResponse>> getById(String id){

    return ResponseEntity.status(HttpStatus.CREATED).body(
            Optional.ofNullable(
                    this.consultRepository.findById(id)
                            .map(ConsultMapper.INSTANCE::consultToConResponse)
                            .orElseThrow(() -> new ConsultExeception("Nenhum Registro Encontrado."))
            )
    );

  }

  @Transactional
  public ResponseEntity<Optional<ConsultResponse>> update(String id, ConsultRequest consultRequest){

    User user = this.isValidUser.isValid(consultRequest.getIddoctor());
    Patient patient = this.isValidPatient.isValid(consultRequest.getIdpatient());

    return  ResponseEntity.status(HttpStatus.OK).body(
            Optional.ofNullable(
                    this.consultRepository.findById(id)
                            .map(consult -> {

                              Consult updateConsult = ConsultMapper.INSTANCE.reqtoConsult(consultRequest);
                              updateConsult.setId(id);
                              updateConsult.setPatient(patient);
                              updateConsult.setUser(user);
                              Consult newConsult = this.consultRepository.save(updateConsult);
                              return ConsultMapper.INSTANCE.consultToConResponse(newConsult);

                            })
                            .orElseThrow(() -> new ConsultExeception("Nenhum Registro Encontrado.")))
    );

  }

  @Transactional
  public ResponseEntity<Object> deleteById(String id)  {

    return this.consultRepository.findById(id)
            .map( consult -> {

              this.consultRepository.deleteById(consult.getId());
              return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);

            }).orElseThrow(() -> new ConsultExeception("Nenhum Registro Encontrado."));

  }

}