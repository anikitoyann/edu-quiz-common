package com.example.eduquizcommon.repository;
import com.example.eduquizcommon.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface QuestionRepository extends JpaRepository<Question,Integer> {
     Optional<Question> findAllByQuiz_id(int quizId);
}
