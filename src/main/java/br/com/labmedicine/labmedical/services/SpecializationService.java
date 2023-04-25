package br.com.labmedicine.labmedical.services;

import br.com.labmedicine.labmedical.exceptions.SpecializationNotFoundExeception;
import br.com.labmedicine.labmedical.mappers.SpecializationMapper;
import br.com.labmedicine.labmedical.models.Specialization;
import br.com.labmedicine.labmedical.repositories.SpecializationRepository;
import br.com.labmedicine.labmedical.dto.request.SpecializationRequest;
import br.com.labmedicine.labmedical.dto.response.SpecializationResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SpecializationService {

    private final SpecializationRepository specializationRepository;

    public SpecializationService(SpecializationRepository specializationRepository) {
        this.specializationRepository = specializationRepository;
    }

    public ResponseEntity<Object> getAll(){

        return ResponseEntity.status(HttpStatus.OK).body(
                this.specializationRepository.findAll().stream()
                .map(SpecializationMapper.INSTANCE::especToSpecResponse
                ));

    }

    public SpecializationResponse save(SpecializationRequest specializationRequest){

        Specialization newSpecialization = SpecializationMapper.INSTANCE.reqToSpecialization(specializationRequest);
        Specialization specialization = this.specializationRepository.save(newSpecialization);

        return SpecializationMapper.INSTANCE.especToSpecResponse(specialization);
    }

    public ResponseEntity<Optional<SpecializationResponse>> getById(String id)  {

        return ResponseEntity.status(HttpStatus.OK).body(
                Optional.ofNullable(
                        this.specializationRepository.findById(id)
                        .map(SpecializationMapper.INSTANCE::especToSpecResponse)
                        .orElseThrow(() -> new SpecializationNotFoundExeception("Nenhum Registro Encontrado."))
                ));
    }

    public ResponseEntity<Optional<SpecializationResponse>> update(String id, SpecializationRequest specializationRequest){

        return  ResponseEntity.status(HttpStatus.OK).body(
                Optional.ofNullable(
                        this.specializationRepository.findById(id)
                        .map(s -> {

                            Specialization specialization = SpecializationMapper.INSTANCE.reqToSpecialization(specializationRequest);
                            specialization.setId(id);
                            Specialization newspecialization = this.specializationRepository.save(specialization);
                            return SpecializationMapper.INSTANCE.especToSpecResponse(newspecialization);

                        })
                        .orElseThrow(() -> new SpecializationNotFoundExeception("Nenhum Registro Encontrado."))
                ));
    }

  public ResponseEntity<Object> deleteById(String id)  {

      return this.specializationRepository.findById(id)
              .map( specialization -> {

                this.specializationRepository.deleteById(specialization.getId());
                return ResponseEntity.status(HttpStatus.OK).body(null);

              }).orElseThrow(() -> new SpecializationNotFoundExeception("Nenhum Registro Encontrado."));

  }
}
