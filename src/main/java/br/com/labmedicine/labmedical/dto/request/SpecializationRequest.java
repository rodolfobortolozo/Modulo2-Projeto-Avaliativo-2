package br.com.labmedicine.labmedical.dto.request;

import lombok.Data;

import java.util.List;

@Data
public class SpecializationRequest {

  private String specialization;
  private List<UserRequest> userRequests;

}
