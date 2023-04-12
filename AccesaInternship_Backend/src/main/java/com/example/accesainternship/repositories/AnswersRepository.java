package com.example.accesainternship.repositories;

import com.example.accesainternship.entities.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswersRepository extends JpaRepository<Answer, Long> {
}
