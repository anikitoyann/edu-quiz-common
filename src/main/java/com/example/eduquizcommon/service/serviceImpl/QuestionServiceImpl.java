package com.example.eduquizcommon.service.serviceImpl;

import com.example.eduquizcommon.entity.Question;
import com.example.eduquizcommon.repository.QuestionRepository;
import com.example.eduquizcommon.service.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class QuestionServiceImpl implements QuestionService {
    private final QuestionRepository questionRepository;

    @Override
    public Optional<Question> findAllByQuiz_id(int quiz_id) {
        return questionRepository.findAllByQuiz_id(quiz_id);
    }

    @Override
    public void save(Question question) {
        questionRepository.save(question);
    }

    @Override
    public List<Question> findAll() {
        return questionRepository.findAll();
    }
}
