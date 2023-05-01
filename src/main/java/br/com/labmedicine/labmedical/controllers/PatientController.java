package br.com.labmedicine.labmedical.controllers;

import br.com.labmedicine.labmedical.dto.request.PatientRequest;
import br.com.labmedicine.labmedical.dto.response.PatientResponse;
import br.com.labmedicine.labmedical.services.PatientService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping({"/api/pacientes", "/patient"})
public class PatientController {

  private final PatientService patientService;


  public PatientController(PatientService patientService) {
    this.patientService = patientService;
  }

  @GetMapping
  public ResponseEntity<Object> getAll(){

    return this.patientService.getAll();
  }

  @PostMapping
  public ResponseEntity<PatientResponse> savePatient(@Valid @RequestBody PatientRequest patientRequest){

    return this.patientService.save(patientRequest);
  }

  @GetMapping(path = "/{id}")
  public ResponseEntity<Optional<PatientResponse>> getPatientbyId(@PathVariable(name = "id") String id){

    return this.patientService.getById(id);
  }

  @PutMapping(path = "/{id}")
  public ResponseEntity<Optional<PatientResponse>> updatePatient(@PathVariable(name = "id") String id,
                                                                 @Valid @RequestBody PatientRequest patientRequest){

    return this.patientService.update(id, patientRequest);
  }

  @DeleteMapping(path = "/{id}")
  public ResponseEntity<Object> deletePatient(@PathVariable(name = "id") String id){

    return this.patientService.deleteById(id);
  }

  @GetMapping(path = "/" )
  public ResponseEntity<Optional<PatientResponse>> getPatientbyName(@RequestParam(name = "name") String name){

    return this.patientService.getByName(name);
  }
}
