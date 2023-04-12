package com.example.accesainternship.repositories;

import com.example.accesainternship.entities.Person;
import com.example.accesainternship.entities.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long> {
}
