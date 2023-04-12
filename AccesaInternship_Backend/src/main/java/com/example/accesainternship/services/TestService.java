package com.example.accesainternship.services;

import com.example.accesainternship.dtos.TestDTO;
import com.example.accesainternship.entities.Test;
import com.example.accesainternship.repositories.PersonRepository;
import com.example.accesainternship.repositories.TestRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TestService {
    private final TestRepository testRepository;
    private final PersonRepository personRepository;
    public TestService(TestRepository testRepository, PersonRepository personRepository) {
        this.testRepository = testRepository;
        this.personRepository = personRepository;
    }
    public Test saveTest(TestDTO testDTO) {
        Test test= Test.builder()
                .category(testDTO.getCategory())
                .author(personRepository.findById(testDTO.getAuthorId()).get())
                .title(testDTO.getTitle())
                .questions(new ArrayList<>())
                .build();

        testRepository.save(test);
        return test;
    }
}
