package br.com.labmedicine.labmedical.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Collection;
import java.util.Date;

@Entity
@Table(name = "PATIENT")
@Data
public class Patient extends Person {

  @Column(name = "PHONEEMERGENCY")
  private String phoneEmergency;

  @Column(name = "AGREEMENT")
  private String agreement;

  @Column(name = "AGREEMENTNUMBER")
  private String agreementNumber;

  @Column(name = "AGREEMENTVALIDITY")
  private Date agreementValidity;

  @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
  @JoinColumn(name = "IDPERSON")
  private Collection<Allergy> allergies;

  @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
  @JoinColumn(name = "IDPERSON")
  private Collection<CautionList> cautionLists;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "IDADDRESS")
  private Address address;

}
