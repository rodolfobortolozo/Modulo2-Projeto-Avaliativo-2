package br.com.labmedicine.labmedical.mappers;

import br.com.labmedicine.labmedical.dto.request.ExamRequest;
import br.com.labmedicine.labmedical.dto.response.ExamResponse;
import br.com.labmedicine.labmedical.models.Exam;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ExamMapper {

    ExamMapper INSTANCE = Mappers.getMapper( ExamMapper.class );

    Exam reqtoExam (ExamRequest examRequest);

    ExamResponse examToExamResponse(Exam exam);
}
