package br.com.labmedicine.labmedical.dto.request;

import lombok.Data;

@Data
public class AddressRequest {

  private String zipCode;

  private String city;

  private String country;

  private String publicPlace;

  private String houseNumber;

  private String complement;

  private String district;

  private String landmark;

}
