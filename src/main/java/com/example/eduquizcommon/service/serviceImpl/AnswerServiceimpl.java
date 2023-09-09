package com.example.eduquizcommon.service.serviceImpl;
import com.example.eduquizcommon.entity.Answer;
import com.example.eduquizcommon.repository.AnswerRepository;
import com.example.eduquizcommon.service.AnswerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
@RequiredArgsConstructor
public class AnswerServiceimpl implements AnswerService {
    private final AnswerRepository answerRepository;
    @Override
    public List<Answer> findAll() {
        return answerRepository.findAll();
    }
    @Override
    public void deleteById(int id) {
        answerRepository.deleteById(id);
    }
    @Override
    public Answer save(Answer answer) {
        answerRepository.save(answer);
        return answer;
    }
    @Override
    public boolean existsById(int id) {
        return answerRepository.existsById(id);
    }

    @Override
    public Integer getTotalScore() {
        return answerRepository.getTotalScore();
    }
}
