package com.example.accesainternship.controller;

import com.example.accesainternship.dtos.TestDTO;
import com.example.accesainternship.entities.Person;
import com.example.accesainternship.entities.Test;
import com.example.accesainternship.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
@CrossOrigin
@RequestMapping("/test")
public class TestController {
    private final TestService testService;
    @Autowired
    public TestController(TestService testService) {
        this.testService = testService;
    }

    @PostMapping("/insert")
    public ResponseEntity<Test> insertTest(@RequestBody TestDTO testDTO){
        return new ResponseEntity<>(testService.saveTest(testDTO), HttpStatus.CREATED);
    }
}
