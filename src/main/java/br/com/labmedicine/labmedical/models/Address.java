package br.com.labmedicine.labmedical.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name ="ADDRESS")
@Data
public class Address {

  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  @Column(name = "IDADDRESS")
  private String id;

  @Column(name = "ZIPCODE")
  private String zipCode;

  @Column(name = "CITY")
  private String city;

  @Column(name = "COUNTRY")
  private String country;

  @Column(name = "PUBLICPLACE")
  private String publicPlace;

  @Column(name = "HOUSENUMBER")
  private String houseNumber;

  @Column(name = "COMPLEMENT")
  private String complement;

  @Column(name = "DISTRICT")
  private String district;

  @Column(name = "LANDMARK")
  private String landmark;

  @OneToOne(mappedBy = "address")
  @JsonIgnore
  private Patient patient;

}
