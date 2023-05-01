package br.com.labmedicine.labmedical.exceptions;

public class PatientConflitExeception extends RuntimeException {

  public PatientConflitExeception(String msg){
    super(msg);
  }
  public PatientConflitExeception(String msg, Throwable cause){
    super(msg, cause);
  }

}
