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

    @Override
    public Quiz save(Quiz quiz) {
         quizRepository.save(quiz);
        return quiz;
    }

    @Override
    public void deleteById(int id) {
        quizRepository.deleteById(id);
    }

    @Override
    public Quiz updateQuiz(Quiz quiz, Optional<Quiz> byId) {
        Quiz quizDb = byId.get();
        if (quiz.getTitle() != null && !quiz.getTitle().isEmpty()) {
            quizDb.setTitle(quiz.getTitle());

        }
        if (quiz.getCreatedDateTime() != null ) {
            quizDb.setCreatedDateTime(quiz.getCreatedDateTime());

        }

        return quizDb;
    }

    @Override
    public boolean existsById(int id) {
        return quizRepository.existsById(id);
    }
}
