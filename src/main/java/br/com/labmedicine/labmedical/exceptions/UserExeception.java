package br.com.labmedicine.labmedical.exceptions;

public class UserExeception extends RuntimeException {

  public UserExeception(String msg){
    super(msg);
  }
  public UserExeception(String msg, Throwable cause){
    super(msg, cause);
  }

}
