package br.com.labmedicine.labmedical.dto.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Data
public abstract class PersonResponse {

  private String id;

  private String name;

  private String gender;

  @JsonFormat(pattern="dd/MM/yyyy")
  private Date bithhDay;

  private String cpf;

  private String rg;

  private String maritalStatus;

  private String phoneNumber;

  private String email;

  private String naturalness;

  private Date dtaCreated;

  private Date dtaUpdated;
}
