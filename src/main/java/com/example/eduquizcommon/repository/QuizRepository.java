package com.example.eduquizcommon.repository;
import com.example.eduquizcommon.entity.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepository extends JpaRepository<Quiz,Integer> {
}
