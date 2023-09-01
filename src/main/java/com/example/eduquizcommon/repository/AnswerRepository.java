package com.example.eduquizcommon.repository;
import com.example.eduquizcommon.entity.Answer;
import com.example.eduquizcommon.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Map;

public interface AnswerRepository extends JpaRepository<Answer,Integer> {

}
