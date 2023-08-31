package com.example.eduquizcommon.service.serviceImpl;

import com.example.eduquizcommon.entity.Quiz;
import com.example.eduquizcommon.repository.QuizRepository;
import com.example.eduquizcommon.service.QuizService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class QuizServiceImpl implements QuizService {
    private final QuizRepository quizRepository;

    @Override
    public Page<Quiz> findAll(Pageable pageable) {
        return quizRepository.findAll(pageable);
    }

    @Override
    public List<Quiz> findAll() {
        return quizRepository.findAll();
    }


    @Override
    public Optional<Quiz> findById(int id) {
        return quizRepository.findById(id);
    }
}
