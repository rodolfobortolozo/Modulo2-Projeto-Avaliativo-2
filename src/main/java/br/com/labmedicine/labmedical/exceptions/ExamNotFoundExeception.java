package br.com.labmedicine.labmedical.exceptions;

public class ExamNotFoundExeception extends RuntimeException {

  public ExamNotFoundExeception(String msg){
    super(msg);
  }
  public ExamNotFoundExeception(String msg, Throwable cause){
    super(msg, cause);
  }

}
