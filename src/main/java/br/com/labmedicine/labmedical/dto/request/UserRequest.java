package br.com.labmedicine.labmedical.dto.request;

import br.com.labmedicine.labmedical.models.Specialization;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.util.List;

@Data
public class UserRequest extends PersonRequest{


  private String crm;

  @Length(min = 8,message = "{password.not.valid}")
  private String password;

  private List<Specialization> specializations;

}
