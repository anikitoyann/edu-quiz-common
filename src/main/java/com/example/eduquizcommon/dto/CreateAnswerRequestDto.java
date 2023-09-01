package com.example.eduquizcommon.dto;

import com.example.eduquizcommon.entity.Question;
import com.example.eduquizcommon.entity.User;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateAnswerRequestDto {
    private int id;
    @ManyToOne
    private User user;
    @ManyToOne
    private Question question;
}
