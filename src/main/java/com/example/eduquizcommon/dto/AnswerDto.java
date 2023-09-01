package com.example.eduquizcommon.dto;

import com.example.eduquizcommon.entity.Question;
import com.example.eduquizcommon.entity.QuestionOption;
import com.example.eduquizcommon.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AnswerDto {

    private User user;
    private Question question;
    private QuestionOption questionOption;

}
