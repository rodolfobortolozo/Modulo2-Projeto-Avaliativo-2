package br.com.labmedicine.labmedical.dto.request;

import lombok.Data;

import java.util.Date;

@Data
public class ExamRequest {

  private String exam;

  private Date dtaHourExam;

  private String examType;

  private String urlFile;

  private String result;

  private String iddoctor;

  private String idpatient;



}
