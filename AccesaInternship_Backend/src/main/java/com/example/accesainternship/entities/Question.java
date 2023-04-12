package com.example.accesainternship.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Question {
    @Id
    @GeneratedValue()
    private int id;
    private String question;
    private int score;
    @OneToMany(fetch= FetchType.EAGER)
    private List<Answer> answers;
}
