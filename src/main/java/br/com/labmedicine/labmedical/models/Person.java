package br.com.labmedicine.labmedical.models;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Entity
@Table(name = "PERSON")
@Data
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Person {

  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  @Column(name = "IDPERSON", unique = true, nullable = false)
  private String id;

  @Column(name = "NAME", nullable = false)
  private String name;

  @Column(name = "GENDER")
  private String gender;


  @Column(name = "BIRTHDAY",nullable = false)
  private Date bithhDay;

  @Column(name = "CPF", updatable = false)
  private String cpf;

  @Column(name = "RG", updatable = false)
  private String rg;

  @Column(name = "MARITALSTATUS")
  @Enumerated(EnumType.STRING)
  private MaritalStatus maritalStatus;

  @Column(name = "PHONENUMBER")
  private String phoneNumber;

  @Column(name = "EMAIL")
  private String email;

  @Column(name = "NATURALNESS")
  private String naturalness;

  @Column(name = "DTACREATED", nullable = false, updatable = false)
  @CreationTimestamp
  @Temporal(TemporalType.TIMESTAMP)
  private Date dtaCreated;

  @Column(name = "DTAUPDATED", nullable = false)
  @UpdateTimestamp
  @Temporal(TemporalType.TIMESTAMP)
  private Date dtaUpdated;


}
