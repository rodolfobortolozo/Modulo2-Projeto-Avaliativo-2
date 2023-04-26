package br.com.labmedicine.labmedical.exceptions;

public class AddressNotFountExeception extends RuntimeException {

  public AddressNotFountExeception(String msg){
    super(msg);
  }
  public AddressNotFountExeception(String msg, Throwable cause){
    super(msg, cause);
  }

}
