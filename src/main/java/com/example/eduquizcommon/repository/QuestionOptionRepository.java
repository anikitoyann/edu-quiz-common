package com.example.eduquizcommon.repository;
import com.example.eduquizcommon.entity.QuestionOption;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface QuestionOptionRepository extends JpaRepository<QuestionOption,Integer> {
    List<QuestionOption> getAllQuestionOptionByQuestionId(int questionId);
}
