package br.com.labmedicine.labmedical.controllers;

import br.com.labmedicine.labmedical.dto.request.SpecializationRequest;
import br.com.labmedicine.labmedical.dto.response.SpecializationResponse;
import br.com.labmedicine.labmedical.services.SpecializationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping({"/api/especialidades","/specialization"})
public class SpecializationController {

    private final SpecializationService specializationService;

    public SpecializationController(SpecializationService specializationService) {
        this.specializationService = specializationService;
    }

    @GetMapping
    public ResponseEntity<Object> getAll(){

        return this.specializationService.getAll();
    }

    @PostMapping
    public ResponseEntity<SpecializationResponse> saveSpecialization(@RequestBody SpecializationRequest specializationRequest){

        return ResponseEntity.status(HttpStatus.OK).body(this.specializationService.save(specializationRequest));

    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Optional<SpecializationResponse>> getBySpecializationId(@PathVariable(name = "id")String id){

        return this.specializationService.getById(id);
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<Optional<SpecializationResponse>> updateSpecialization(@PathVariable(name = "id")String id,
                                                                                 @RequestBody SpecializationRequest specializationRequest){

        return this.specializationService.update(id, specializationRequest);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Object> updateSpecialization(@PathVariable(name = "id")String id){

        return this.specializationService.deleteById(id);
    }

}
