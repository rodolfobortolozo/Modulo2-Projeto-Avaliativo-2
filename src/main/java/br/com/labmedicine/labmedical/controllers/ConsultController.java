package br.com.labmedicine.labmedical.controllers;

import br.com.labmedicine.labmedical.dto.request.ConsultRequest;
import br.com.labmedicine.labmedical.dto.request.PatientRequest;
import br.com.labmedicine.labmedical.dto.response.ConsultResponse;
import br.com.labmedicine.labmedical.dto.response.PatientResponse;
import br.com.labmedicine.labmedical.services.ConsultService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping({"/api/consultas", "/consult"})
public class ConsultController {

  private final ConsultService consultService;

  public ConsultController(ConsultService consultService) {
    this.consultService = consultService;
  }

  @GetMapping
  public ResponseEntity<Object> getAll(){

    return this.consultService.getAll();
  }

  @PostMapping
  public ResponseEntity<ConsultResponse> saveConsult(@RequestBody ConsultRequest consultRequest){

    return this.consultService.save(consultRequest);
  }

  @GetMapping(path = "/{id}")
  public ResponseEntity<Optional<ConsultResponse>> getConsultbyId(@PathVariable(name = "id") String id){

    return this.consultService.getById(id);
  }

  @PutMapping(path = "/{id}")
  public ResponseEntity<Optional<ConsultResponse>> updateConsult(@PathVariable(name = "id") String id,
                                       @RequestBody ConsultRequest consultRequest){

    return this.consultService.update(id, consultRequest);
  }

  @DeleteMapping(path = "/{id}")
  public ResponseEntity<Object> deleteConsult(@PathVariable(name = "id") String id){

    return this.consultService.deleteById(id);
  }
}
