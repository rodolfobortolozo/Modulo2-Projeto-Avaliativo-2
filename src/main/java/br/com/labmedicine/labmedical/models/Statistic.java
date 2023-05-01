package br.com.labmedicine.labmedical.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Immutable;

import java.util.Date;

@Entity
@Table(name = "V_STATISTICS")
@Immutable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Statistic {

    @Id
    @Enumerated(EnumType.STRING)
    @Column(name = "TYPE")
    private TypeStatistic type;

    @Column(name = "VALUE")
    private Long value;

    @Column(name = "LASTCREATED")
    private Date lastCreated;

}
