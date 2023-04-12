package com.example.accesainternship.services;

import com.example.accesainternship.dtos.AnswerDTO;
import com.example.accesainternship.dtos.QuestionDTO;
import com.example.accesainternship.entities.Answer;
import com.example.accesainternship.entities.Question;
import com.example.accesainternship.entities.Test;
import com.example.accesainternship.repositories.QuestionRepository;
import com.example.accesainternship.repositories.TestRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionService {
    private final QuestionRepository questionRepository;
    private final AnswersService answersService;
    private final TestRepository testRepository;
    public QuestionService(QuestionRepository questionRepository, AnswersService answersService, TestRepository testRepository) {
        this.questionRepository = questionRepository;
        this.answersService = answersService;
        this.testRepository = testRepository;
    }

    public Question saveQuestion(QuestionDTO questionDTO)
    {
         Question q=Question.builder()
                 .question(questionDTO.getQuestion())
                 .score(questionDTO.getScore())
                 .answers(new ArrayList<>())
                 .build();
         questionRepository.save(q);
         Test test=testRepository.findById(questionDTO.getIdTest()).get();
         List<Question> questionList= test.getQuestions();
         questionList.add(q);
         test.setQuestions(questionList);
         testRepository.save(test);
         List<Answer> answerList=new ArrayList<>();
         for(AnswerDTO a: questionDTO.getAnswers())
         {
             Answer answer=answersService.saveAnswer(a);
             answerList.add(answer);
         }
         q.setAnswers(answerList);
         questionRepository.save(q);
         return q;
    }
}
