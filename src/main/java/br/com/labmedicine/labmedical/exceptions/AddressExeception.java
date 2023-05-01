package br.com.labmedicine.labmedical.exceptions;

public class AddressExeception extends RuntimeException {

  public AddressExeception(String msg){
    super(msg);
  }
  public AddressExeception(String msg, Throwable cause){
    super(msg, cause);
  }

}
