package com.example.eduquizcommon.dto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class QuestionDto {
    private int id;
    private String title;
    private int score;
}
