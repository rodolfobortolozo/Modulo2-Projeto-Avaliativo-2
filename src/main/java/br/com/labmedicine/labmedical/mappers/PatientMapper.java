package br.com.labmedicine.labmedical.mappers;

import br.com.labmedicine.labmedical.dto.request.PatientRequest;
import br.com.labmedicine.labmedical.dto.response.PatientResSimple;
import br.com.labmedicine.labmedical.dto.response.PatientResponse;
import br.com.labmedicine.labmedical.models.Patient;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface PatientMapper {

    PatientMapper INSTANCE = Mappers.getMapper( PatientMapper.class );

    Patient reqtoPatient (PatientRequest patientRequest);

    PatientResponse patientToPatResponse(Patient patient);

    PatientResSimple patientToRespSimple(Patient patient);
}
