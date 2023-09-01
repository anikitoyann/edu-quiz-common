package com.example.eduquizcommon.service;

import com.example.eduquizcommon.entity.QuestionOption;

import java.util.List;

public interface QuestionOptionService {
    QuestionOption save(QuestionOption questionOption);


    List<QuestionOption> getQuestionOptionByQuestionId(int questionId);

    List<QuestionOption> findAll();
}
