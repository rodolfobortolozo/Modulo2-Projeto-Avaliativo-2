package br.com.labmedicine.labmedical.exceptions;

public class UserNotFoundExeception extends RuntimeException {

  public UserNotFoundExeception(String msg){
    super(msg);
  }
  public UserNotFoundExeception(String msg, Throwable cause){
    super(msg, cause);
  }

}
