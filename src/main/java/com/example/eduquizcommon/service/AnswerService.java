package com.example.eduquizcommon.service;
import com.example.eduquizcommon.entity.Answer;
import java.util.List;

public interface AnswerService {

    List<Answer> findAll();

    void deleteById(int id);

    Answer save(Answer answer);

    boolean existsById(int id);

    Integer getTotalScore();
}
