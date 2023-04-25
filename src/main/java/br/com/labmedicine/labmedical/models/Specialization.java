package br.com.labmedicine.labmedical.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "SPECIALIZATION")
@Data
public class Specialization {

  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  @Column(name = "IDSPECIALIZATION")
  private String id;

  @Column(name = "SPECIALIZATION", nullable = false)
  private String specialization;

  @ManyToMany(fetch = FetchType.LAZY, mappedBy = "specializations")
  @JsonIgnore
  private List<User> user;

  @Column(name = "DTACREATED", nullable = false, updatable = false)
  @CreationTimestamp
  @Temporal(TemporalType.TIMESTAMP)
  private Date dtaCreated;

  @Column(name = "DTAUPDATED", nullable = false)
  @UpdateTimestamp
  @Temporal(TemporalType.TIMESTAMP)
  private Date dtaUpdated;


}
