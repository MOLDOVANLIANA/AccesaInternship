package com.example.accesainternship.repositories;

import com.example.accesainternship.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PersonRepository extends JpaRepository<Person, Long> {
  Person findByUsernameAndPassword(String username, String password);
}
