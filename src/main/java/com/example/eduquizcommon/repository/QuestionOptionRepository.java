package com.example.eduquizcommon.repository;
import com.example.eduquizcommon.entity.QuestionOption;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionOptionRepository extends JpaRepository<QuestionOption,Integer> {
}
