package com.example.eduquizcommon.service;

import com.example.eduquizcommon.entity.Question;

import java.util.List;
import java.util.Optional;

public interface QuestionService {
    List<Question> findAllQuestionByQuiz_id(int quiz_id);

    void save(Question question);

    List<Question> findAll();

    void deleteById(int id);

    boolean existsById(int id);

    Optional<Question> findById(Integer questionId);
}
