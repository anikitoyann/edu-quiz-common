package com.example.eduquizcommon.mapper.mapper;

import com.example.eduquizcommon.dto.AnswerDto;
import com.example.eduquizcommon.dto.CreateAnswerRequestDto;
import com.example.eduquizcommon.entity.Answer;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AnswerMapper {
    Answer map(CreateAnswerRequestDto createAnswerRequestDto);
    AnswerDto mapToDto(Answer answer);
    List<AnswerDto> mapListToDtos(List<Answer> answers);
}
