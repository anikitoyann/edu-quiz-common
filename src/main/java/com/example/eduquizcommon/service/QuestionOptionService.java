package com.example.eduquizcommon.service;
import com.example.eduquizcommon.entity.QuestionOption;
import java.util.List;
import java.util.Optional;

public interface QuestionOptionService {
    QuestionOption save(QuestionOption questionOption);


    List<QuestionOption> getAllQuestionOptionByQuestionId(int questionId);

    List<QuestionOption> findAll();

    Optional<QuestionOption> findById(Integer questionOptionId);
}
