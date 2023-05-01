package br.com.labmedicine.labmedical.exceptions;

public class SpecializationNotFoundExeception extends RuntimeException {

  public SpecializationNotFoundExeception(String msg){
    super(msg);
  }
  public SpecializationNotFoundExeception(String msg, Throwable cause){
    super(msg, cause);
  }

}
