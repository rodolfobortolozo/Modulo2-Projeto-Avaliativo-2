package br.com.labmedicine.labmedical.dto.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.br.CPF;

import java.util.Date;

@Data
public abstract class PersonRequest {


  @NotNull(message = "{name.not.null}")
  private String name;

  @NotNull(message = "{gender.not.null}")
  private String gender;

  @JsonFormat(pattern="dd/MM/yyyy")
  @NotNull(message = "{bithhday.not.null}")
  private Date bithhDay;

  @CPF(message = "{cpf.not.valid}")
  private String cpf;

  @NotNull(message = "{rg.not.null}")
  private String rg;

  @NotNull(message = "{maritalstatus.not.null}")
  private String maritalStatus;

  @NotNull(message = "{phonenumber.not.null}")
  private String phoneNumber;

  @Email(message = "{email.not.valid}")
  private String email;

  @NotNull(message = "{naturalness.not.null}")
  private String naturalness;

}
