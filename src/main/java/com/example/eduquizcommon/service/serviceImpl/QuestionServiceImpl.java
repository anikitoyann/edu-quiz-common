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
    public List<Question> findAllQuestionByQuiz_id(int quiz_id) {
        return questionRepository.findAllQuestionByQuiz_id(quiz_id);
    }
    @Override
    public void save(Question question) {
        questionRepository.save(question);
    }

    @Override
    public List<Question> findAll() {
        return questionRepository.findAll();
    }

    @Override
    public void deleteById(int id) {
        questionRepository.deleteById(id);
    }

    @Override
    public boolean existsById(int id) {
        return questionRepository.existsById(id);
    }

    @Override
    public Optional<Question> findById(Integer questionId) {
        return questionRepository.findById(questionId);
    }


}
