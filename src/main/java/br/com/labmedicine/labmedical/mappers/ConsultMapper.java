package br.com.labmedicine.labmedical.mappers;

import br.com.labmedicine.labmedical.dto.request.ConsultRequest;
import br.com.labmedicine.labmedical.dto.response.ConsultResponse;
import br.com.labmedicine.labmedical.models.Consult;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ConsultMapper {

    ConsultMapper INSTANCE = Mappers.getMapper( ConsultMapper.class );

    Consult reqtoConsult (ConsultRequest consultRequest);

    ConsultResponse consultToConResponse(Consult consult);
}
