package com.example.eduquizcommon.dto;
import com.example.eduquizcommon.entity.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SingleQuizDto {
    private Answer answer;
    private Quiz quiz;
    private Question question;
    private QuestionOption questionOption;
}
