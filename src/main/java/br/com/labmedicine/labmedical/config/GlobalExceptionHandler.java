package br.com.labmedicine.labmedical.config;

import br.com.labmedicine.labmedical.exceptions.*;
import br.com.labmedicine.labmedical.models.ErrorObject;
import br.com.labmedicine.labmedical.models.ErrorResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.List;
import java.util.stream.Collectors;

@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

  //BadRequest
  @ExceptionHandler({ConsultExeception.class, ExamExeception.class, PatientExeception.class,
          SpecializationExeception.class, UserExeception.class, Exception.class})
  public ResponseEntity<ErrorResponse> handleException(Exception ex){

    HttpStatus codigo = HttpStatus.BAD_REQUEST;
    ErrorResponse error = new ErrorResponse(ex.getMessage(),codigo.value(),codigo.toString(),ex.getClass().getSimpleName(), null);
    return ResponseEntity.status(codigo).body(error);
  }

  //Conflit
  @ExceptionHandler({UserConflitExeception.class, PatientConflitExeception.class})
  public ResponseEntity<ErrorResponse> handleConflitException(Exception ex){

    HttpStatus codigo = HttpStatus.CONFLICT;
    ErrorResponse error = new ErrorResponse(ex.getMessage(),codigo.value(),codigo.toString(),ex.getClass().getSimpleName(), null);
    return ResponseEntity.status(codigo).body(error);
  }

  //NotFound
  @ExceptionHandler({ConsultNotFountExeception.class, ExamNotFoundExeception.class, PatientNotFoundExeception.class,
          SpecializationNotFoundExeception.class, UserNotFoundExeception.class})
  public ResponseEntity<ErrorResponse> handleNotFountException(Exception ex){

    HttpStatus codigo = HttpStatus.NOT_FOUND;
    ErrorResponse error = new ErrorResponse(ex.getMessage(),codigo.value(),codigo.toString(),ex.getClass().getSimpleName(), null);
    return ResponseEntity.status(codigo).body(error);
  }

  @Override
  protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers,  HttpStatusCode status, WebRequest request) {
    List<ErrorObject> errors = getErrors(ex);
    ErrorResponse errorResponse = getErrorResponse(ex, status, errors);
    return new ResponseEntity<>(errorResponse, status);
  }

  private ErrorResponse getErrorResponse(MethodArgumentNotValidException ex, HttpStatusCode status, List<ErrorObject> errors) {
    return new ErrorResponse("Requisição possui Campo(s) Inválido(s)", status.value(),
            status.toString(), ex.getBindingResult().getObjectName(), errors);
  }

  private List<ErrorObject> getErrors(MethodArgumentNotValidException ex) {
    return ex.getBindingResult().getFieldErrors().stream()
            .map(error -> new ErrorObject(error.getField(), error.getDefaultMessage(), error.getRejectedValue()))
            .collect(Collectors.toList());
  }

}
