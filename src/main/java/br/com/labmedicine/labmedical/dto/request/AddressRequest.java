package br.com.labmedicine.labmedical.dto.request;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class AddressRequest {

  @NotEmpty(message = "Cep Obrigatório")
  private String zipCode;

  @NotEmpty(message = "Cidade Obrigatório")
  private String city;

  @NotEmpty(message = "Estado Obrigatório")
  private String country;

  @NotEmpty(message = "Rua Obrigatório")
  private String publicPlace;

  @NotEmpty(message = "Numero Obrigatório")
  private String houseNumber;

  @NotEmpty(message = "Complemento Obrigatório")
  private String complement;

  @NotEmpty(message = "Bairro Obrigatório")
  private String district;

  @NotEmpty(message = "Referência Obrigatório")
  private String landmark;

}
