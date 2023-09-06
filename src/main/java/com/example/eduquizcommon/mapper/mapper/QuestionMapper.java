package com.example.eduquizcommon.mapper.mapper;
import com.example.eduquizcommon.dto.QuestionDto;
import com.example.eduquizcommon.entity.Question;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface QuestionMapper {

    QuestionDto mapToDto(Question question);
    List<QuestionDto> mapListToDtos(List<Question> quizzes);
}
