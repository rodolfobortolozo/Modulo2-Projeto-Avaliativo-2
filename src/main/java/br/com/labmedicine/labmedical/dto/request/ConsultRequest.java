package br.com.labmedicine.labmedical.dto.request;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

import java.util.Date;

@Data
public class ConsultRequest {

  @NotEmpty(message = "Motivo Obrigatório")
  private String motive;

  @NotEmpty(message = "Data da consulta Obrigatório")
  private Date dtaHourConsult;

  @NotEmpty(message = "Descrição Obrigatória")
  private String description;

  @NotEmpty(message = "Medicação Obrigatória")
  private String medication;

  @NotEmpty(message = "Precauções Obrigatório")
  private String precautions;

  @NotEmpty(message = "Médico Obrigatório")
  private String iddoctor;

  @NotEmpty(message = "Paciente Obrigatório")
  private String idpatient;

}
