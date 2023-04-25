package br.com.labmedicine.labmedical.exceptions;

public class SpecializationExeception extends RuntimeException {

  public SpecializationExeception(String msg){
    super(msg);
  }
  public SpecializationExeception(String msg, Throwable cause){
    super(msg, cause);
  }

}
