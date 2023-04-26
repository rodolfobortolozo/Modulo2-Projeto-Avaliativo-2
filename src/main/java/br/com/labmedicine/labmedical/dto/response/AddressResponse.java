package br.com.labmedicine.labmedical.dto.response;

import br.com.labmedicine.labmedical.models.Patient;
import lombok.Data;

@Data
public class AddressResponse {

  private String id;

  private String zipCode;

  private String city;

  private String country;

  private String publicPlace;

  private String houseNumber;

  private String complement;

  private String district;

  private String landmark;

  private Patient patient;

}
