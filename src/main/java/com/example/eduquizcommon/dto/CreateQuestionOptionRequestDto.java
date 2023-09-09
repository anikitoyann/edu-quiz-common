package com.example.eduquizcommon.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateQuestionOptionRequestDto {
    private  String title;
    private int score;
}
