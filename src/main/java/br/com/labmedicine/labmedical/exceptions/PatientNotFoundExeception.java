package br.com.labmedicine.labmedical.exceptions;

public class PatientNotFoundExeception extends RuntimeException {

  public PatientNotFoundExeception(String msg){
    super(msg);
  }
  public PatientNotFoundExeception(String msg, Throwable cause){
    super(msg, cause);
  }

}
