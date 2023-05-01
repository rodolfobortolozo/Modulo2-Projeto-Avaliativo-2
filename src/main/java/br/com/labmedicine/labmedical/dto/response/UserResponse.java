package br.com.labmedicine.labmedical.dto.response;

import lombok.Data;

import java.util.List;

@Data
public final class UserResponse extends PersonResponse {

  private String crm;

  private List<SpecializationResponse> specializations;

}
