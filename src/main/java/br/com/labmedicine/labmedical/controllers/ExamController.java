package br.com.labmedicine.labmedical.controllers;

import br.com.labmedicine.labmedical.dto.request.ExamRequest;
import br.com.labmedicine.labmedical.dto.response.ExamResponse;
import br.com.labmedicine.labmedical.services.ExamService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping({"/api/exames", "/exam"})
public class ExamController {

  private final ExamService examService;

  public ExamController(ExamService examService) {
    this.examService = examService;
  }

  @GetMapping
  public ResponseEntity<Object> getAll(){

    return this.examService.getAll();
  }

  @PostMapping
  public ResponseEntity<ExamResponse> saveExam(@Valid  @RequestBody ExamRequest examRequest){

    return this.examService.save(examRequest);
  }

  @GetMapping(path = "/{id}")
  public ResponseEntity<Optional<ExamResponse>> getExambyId(@PathVariable(name = "id") String id){

    return this.examService.getById(id);
  }

  @PutMapping(path = "/{id}")
  public ResponseEntity<Optional<ExamResponse>> updateExam(@PathVariable(name = "id") String id,
                                                           @Valid @RequestBody ExamRequest examRequest){

    return this.examService.update(id, examRequest);
  }

  @DeleteMapping(path = "/{id}")
  public ResponseEntity<Object> deleteConsult(@PathVariable(name = "id") String id){

    return this.examService.deleteById(id);
  }

  @GetMapping(path = "/{id}/pacientes")
  public ResponseEntity<List<ExamResponse>> getPatientbyId(@PathVariable(name = "id") String id){

    return this.examService.getByPatientId(id);
  }
}
