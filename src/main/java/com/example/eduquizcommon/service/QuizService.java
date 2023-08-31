package com.example.eduquizcommon.service;

import com.example.eduquizcommon.entity.Quiz;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface QuizService {
    Page<Quiz> findAll(Pageable pageable);
    List<Quiz> findAll();

    Optional<Quiz> findById(int id);
}
