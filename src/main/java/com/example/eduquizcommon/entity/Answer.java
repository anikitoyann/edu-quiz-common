package com.example.eduquizcommon.entity;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@Entity
@Table
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
@ManyToOne
private User user;
@ManyToOne
private Question question;
@ManyToOne
private  QuestionOption questionOption;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
private Date dateTime;
}
