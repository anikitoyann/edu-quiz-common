package com.example.eduquizcommon.repository;
import com.example.eduquizcommon.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface QuestionRepository extends JpaRepository<Question,Integer> {
     List<Question> findAllQuestionByQuiz_id(int quizId);
}
