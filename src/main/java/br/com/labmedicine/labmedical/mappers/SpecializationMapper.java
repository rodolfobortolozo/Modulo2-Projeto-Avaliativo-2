package br.com.labmedicine.labmedical.mappers;

import br.com.labmedicine.labmedical.models.Specialization;
import br.com.labmedicine.labmedical.dto.request.SpecializationRequest;
import br.com.labmedicine.labmedical.dto.response.SpecializationResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface SpecializationMapper {

  SpecializationMapper INSTANCE = Mappers.getMapper( SpecializationMapper.class );

  Specialization reqToSpecialization (SpecializationRequest specializationRequest);

  SpecializationResponse especToSpecResponse (Specialization specialization);
}
