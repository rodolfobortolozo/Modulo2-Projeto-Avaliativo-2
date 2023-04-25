package br.com.labmedicine.labmedical.exceptions;

public class ConsultNotFountExeception extends RuntimeException {

  public ConsultNotFountExeception(String msg){
    super(msg);
  }
  public ConsultNotFountExeception(String msg, Throwable cause){
    super(msg, cause);
  }

}
