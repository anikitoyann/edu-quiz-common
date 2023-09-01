package com.example.eduquizcommon.mapper.mapper;

import com.example.eduquizcommon.dto.CreateQuestionOptionRequestDto;
import com.example.eduquizcommon.dto.QuestionOptionDto;
import com.example.eduquizcommon.dto.QuizDto;
import com.example.eduquizcommon.entity.QuestionOption;
import com.example.eduquizcommon.entity.Quiz;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface QuestionOptionMapper {
    QuestionOption map(CreateQuestionOptionRequestDto createQuizRequestDto);
    QuestionOptionDto mapToDto(QuestionOption questionOption);
    List<QuestionOptionDto> mapListToDtos(List<QuestionOption> questionOptions);
}
