package com.example.accesainternship.dtos;

import lombok.Data;

import java.util.List;

@Data
public class QuestionDTO {
    private Long idTest;
    private String question;
    private int score;
    private List<AnswerDTO> answers;
}
