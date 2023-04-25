package br.com.labmedicine.labmedical.dto.request;

import lombok.Data;

import java.util.Date;

@Data
public class ConsultRequest {

  private String motive;

  private Date dtaHourConsult;

  private String description;

  private String medication;

  private String precautions;

  private String iddoctor;

  private String idpatient;

}
