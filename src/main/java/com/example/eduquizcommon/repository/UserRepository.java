package com.example.eduquizcommon.repository;
import com.example.eduquizcommon.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question,Integer> {
}
