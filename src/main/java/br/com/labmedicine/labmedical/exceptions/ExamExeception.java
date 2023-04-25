package br.com.labmedicine.labmedical.exceptions;

public class ExamExeception extends RuntimeException {

  public ExamExeception(String msg){
    super(msg);
  }
  public ExamExeception(String msg, Throwable cause){
    super(msg, cause);
  }

}
