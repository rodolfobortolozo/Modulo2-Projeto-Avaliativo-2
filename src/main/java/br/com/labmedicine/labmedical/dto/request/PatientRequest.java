package br.com.labmedicine.labmedical.dto.request;

import br.com.labmedicine.labmedical.models.Address;
import br.com.labmedicine.labmedical.models.Allergy;
import br.com.labmedicine.labmedical.models.CautionList;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Collection;
import java.util.Date;

@Data
public class PatientRequest extends PersonRequest{

  private String phoneEmergency;

  private String agreement;

  private String agreementNumber;

  @JsonFormat(pattern="dd/MM/yyyy")
  private Date agreementValidity;

  private Collection<Allergy> allergies;

  private Collection<CautionList> cautionLists;

  private Address address;

  private String idAddress;
}
