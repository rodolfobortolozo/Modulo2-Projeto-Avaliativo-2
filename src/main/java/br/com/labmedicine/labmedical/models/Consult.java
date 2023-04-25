package br.com.labmedicine.labmedical.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Entity
@Table(name = "CONSULT")
@Data
public class Consult {

  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  @Column(name="IDCONSULT")
  private String id;

  @Column(name = "MOTIVE")
  private String motive;

  @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss")
  @Column(name = "DTAHOURCONSULT")
  private Date dtaHourConsult;

  @Column(name = "DESCRIPTION")
  private String description;

  @Column(name = "MEDICATION")
  private String medication;

  @Column(name = "PRECAUTIONS")
  private String precautions;

  @ManyToOne()
  @JoinColumn(name = "IDUSER")
  private User user;

  @ManyToOne()
  @JoinColumn(name = "IDPATIENT")
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
