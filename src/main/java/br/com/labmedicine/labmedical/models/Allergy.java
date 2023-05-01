package br.com.labmedicine.labmedical.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Entity
@Table(name = "ALLERGY")
@Data
public class Allergy {

  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  @Column(name = "IDALLERGY")
  private String id;

  @Column(name = "ALLERGY")
  private String allergy;

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "IDPERSON")
  @JsonIgnore
  private Patient patient;

  @Column(name = "DTACREATED", nullable = false, updatable = false)
  @CreationTimestamp
  @Temporal(TemporalType.TIMESTAMP)
  private Date dtaCreated;

  @Column(name = "DTAUPDATED", nullable = false)
  @UpdateTimestamp
  @Temporal(TemporalType.TIMESTAMP)
  private Date dtaUpdated;


}
