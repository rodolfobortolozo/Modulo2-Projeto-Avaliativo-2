package br.com.labmedicine.labmedical.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "DOCTOR")
@Data
public class User extends Person  {

  @Column(name = "CRM", nullable = false, updatable = false)
  private String crm;

  private String password;

  @ManyToMany(fetch = FetchType.EAGER)
  @JoinTable(name = "MEDICALSPECIALIZATION",
          joinColumns =  @JoinColumn(name = "IDDOCTOR"),
          inverseJoinColumns = @JoinColumn(name = "IDSPECIALIZATION"))
  private List<Specialization> specializations;

}
