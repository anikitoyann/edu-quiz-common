package com.example.eduquizcommon.service;

import com.example.eduquizcommon.entity.Question;

import java.util.List;
import java.util.Optional;

public interface QuestionService {
    Optional<Question> findAllByQuiz_id(int quiz_id);

    void save(Question question);

    List<Question> findAll();
}
