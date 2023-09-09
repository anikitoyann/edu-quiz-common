package com.example.eduquizcommon.repository;
import com.example.eduquizcommon.entity.Answer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
public interface AnswerRepository extends JpaRepository<Answer,Integer> {
    @Query("SELECT SUM(question.score) FROM Answer WHERE questionOption.isCorrect = true")
    Integer getTotalScore();
}
