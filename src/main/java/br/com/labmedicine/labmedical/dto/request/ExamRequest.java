package br.com.labmedicine.labmedical.dto.request;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

import java.util.Date;

@Data
public class ExamRequest {

  @NotEmpty(message = "Exame Obrigatório")
  private String exam;

  @NotEmpty(message = "Data do Exame Obrigatório")
  private Date dtaHourExam;

  @NotEmpty(message = "Tipo do Exame Obrigatório")
  private String examType;

  private String urlFile;

  private String result;

  private String iddoctor;

  private String idpatient;



}
