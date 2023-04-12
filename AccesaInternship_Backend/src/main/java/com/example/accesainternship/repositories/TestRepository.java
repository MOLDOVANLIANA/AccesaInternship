package com.example.accesainternship.repositories;

import com.example.accesainternship.entities.Person;
import com.example.accesainternship.entities.Test;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<Test, Long> {

}
