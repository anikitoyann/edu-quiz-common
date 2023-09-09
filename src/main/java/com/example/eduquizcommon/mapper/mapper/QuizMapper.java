package com.example.eduquizcommon.mapper.mapper;
import com.example.eduquizcommon.dto.CreateQuizRequestDto;
import com.example.eduquizcommon.dto.QuizDto;
import com.example.eduquizcommon.entity.Quiz;
import org.mapstruct.Mapper;
import java.util.List;

@Mapper(componentModel = "spring")
public interface QuizMapper {
    Quiz map(CreateQuizRequestDto createQuizRequestDto);
    QuizDto mapToDto(Quiz quiz);
    List<QuizDto> mapListToDtos(List<Quiz> quizzes);
}
