package br.com.labmedicine.labmedical.models;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class Statistic {

    @Enumerated(EnumType.STRING)
    private TypeStatistic type;

    private Long value;

    private Date dtaCreated;

}
