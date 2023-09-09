package com.example.eduquizcommon.entity;
import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
@Table
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Enumerated(value = EnumType.STRING)
    private Type type;
    private String title;
    private int score;
    @ManyToOne
    private Quiz quiz;
}
