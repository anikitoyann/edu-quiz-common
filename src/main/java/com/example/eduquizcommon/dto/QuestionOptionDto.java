package com.example.eduquizcommon.dto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class QuestionOptionDto {
    private  String title;
  private boolean isCorrect;
}
