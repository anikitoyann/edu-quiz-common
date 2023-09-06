package com.example.eduquizcommon.service.serviceImpl;

import com.example.eduquizcommon.entity.QuestionOption;
import com.example.eduquizcommon.repository.QuestionOptionRepository;
import com.example.eduquizcommon.service.QuestionOptionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class QuestionOptionServiceImpl implements QuestionOptionService {
    private final QuestionOptionRepository questionOptionRepository;


    @Override
    public QuestionOption save(QuestionOption questionOption) {
        questionOptionRepository.save(questionOption);
        return questionOption;
    }

    @Override
    public List<QuestionOption> getAllQuestionOptionByQuestionId(int questionId) {
        return questionOptionRepository.getAllQuestionOptionByQuestionId(questionId);
    }

    @Override
    public List<QuestionOption> findAll() {
        return questionOptionRepository.findAll();
    }

    @Override
    public Optional<QuestionOption> findById(Integer questionOptionId) {
        return questionOptionRepository.findById(questionOptionId);
    }


}
