package br.com.labmedicine.labmedical.dto.response;

import lombok.Data;

import java.util.Date;

@Data
public class SpecializationResponse {

  private String id;
  private String specialization;
  private Date dtaCreated;
  private Date dtaUpdated;

}
