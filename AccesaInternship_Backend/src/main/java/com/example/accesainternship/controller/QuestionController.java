package com.example.accesainternship.controller;

import com.example.accesainternship.dtos.QuestionDTO;
import com.example.accesainternship.dtos.TestDTO;
import com.example.accesainternship.entities.Question;
import com.example.accesainternship.entities.Test;
import com.example.accesainternship.services.QuestionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/question")
public class QuestionController {
    private final QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }
    @PostMapping("/insert")
    public ResponseEntity<Question> insertQuestion(@RequestBody QuestionDTO questionDTO){
        return new ResponseEntity<>(questionService.saveQuestion(questionDTO), HttpStatus.CREATED);
    }

}
