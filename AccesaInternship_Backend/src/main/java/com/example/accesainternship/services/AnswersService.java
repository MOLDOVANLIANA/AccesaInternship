package com.example.accesainternship.services;

import com.example.accesainternship.dtos.AnswerDTO;
import com.example.accesainternship.entities.Answer;
import com.example.accesainternship.repositories.AnswersRepository;
import org.springframework.stereotype.Service;

@Service
public class AnswersService {
    private final AnswersRepository answersRepository;

    public AnswersService(AnswersRepository answersRepository) {
        this.answersRepository = answersRepository;
    }

    public Answer saveAnswer(AnswerDTO answerDTO)
    {
        Answer a=Answer.builder()
                .answer(answerDTO.getText())
                .isCorrect(answerDTO.getIsChecked())
                .build();
        return answersRepository.save(a);
    }
}
