package com.example.eduquizcommon.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table
public class QuestionOption {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private Question question;
    private String title;
    private boolean isCorrect;

}
