package br.com.labmedicine.labmedical.exceptions;

public class PatientExeception extends RuntimeException {

  public PatientExeception(String msg){
    super(msg);
  }
  public PatientExeception(String msg, Throwable cause){
    super(msg, cause);
  }

}
