package br.com.labmedicine.labmedical.exceptions;

public class ConsultExeception extends RuntimeException {

  public ConsultExeception(String msg){
    super(msg);
  }
  public ConsultExeception(String msg, Throwable cause){
    super(msg, cause);
  }

}
