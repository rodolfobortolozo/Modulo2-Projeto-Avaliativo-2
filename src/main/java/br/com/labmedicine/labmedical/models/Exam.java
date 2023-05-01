package br.com.labmedicine.labmedical.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Entity
@Table(name = "EXAM")
@Data
public class Exam {

  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  @Column(name="IDEXAM")
  private String id;

  @Column(name = "EXAM")
  private String exam;

  @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss")
  @Column(name = "DTAHOUREXAM")
  private Date dtaHourExam;

  @Column(name = "EXAMTYPE")
  private String examType;

  @Column(name = "URLFILE")
  private String urlFile;

  @Column(name = "RESULT")
  private String result;

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
