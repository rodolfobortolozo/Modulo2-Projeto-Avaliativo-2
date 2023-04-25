package br.com.labmedicine.labmedical.dto.response;

import lombok.Data;

import java.util.Date;

@Data
public class ExamResponse {

  private String id;

  private String exam;

  private Date dtaHourExam;

  private String examType;

  private String urlFile;

  private String result;

  private UserResSimple user;

  private PatientResSimple patient;

  private Date dtaCreated;

  private Date dtaUpdated;
}
