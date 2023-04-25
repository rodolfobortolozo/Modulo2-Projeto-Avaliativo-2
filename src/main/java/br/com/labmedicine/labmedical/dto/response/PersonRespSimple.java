package br.com.labmedicine.labmedical.dto.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public abstract class PersonRespSimple {

  private String id;

  private String name;

}
