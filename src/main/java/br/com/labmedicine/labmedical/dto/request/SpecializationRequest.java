package br.com.labmedicine.labmedical.dto.request;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

import java.util.List;

@Data
public class SpecializationRequest {

  @NotEmpty(message = "Nome da Especialização Obrigatório")
  private String specialization;

  private List<UserRequest> userRequests;

}
