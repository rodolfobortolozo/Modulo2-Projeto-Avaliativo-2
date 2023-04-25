package br.com.labmedicine.labmedical.dto.response;

import lombok.Data;

import java.util.Date;

@Data
public class ConsultResponse {

  private String id;

  private String motive;

  private Date dtaHourConsult;

  private String description;

  private String medication;

  private String precautions;

  private UserResSimple user;

  private PatientResSimple patient;

  private Date dtaCreated;

  private Date dtaUpdated;



}
