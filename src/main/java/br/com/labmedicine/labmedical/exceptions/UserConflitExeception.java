package br.com.labmedicine.labmedical.exceptions;

public class UserConflitExeception extends RuntimeException {

  public UserConflitExeception(String msg){
    super(msg);
  }
  public UserConflitExeception(String msg, Throwable cause){
    super(msg, cause);
  }

}
