package com.example.eduquizcommon.dto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class QuizDto {
    private int id;
    private  String title;
    private Date createdDateTime;
}
