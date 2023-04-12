package com.example.accesainternship.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Badge {
    @Id
    @GeneratedValue()
    private Long id;
    private String tokenName;
    private int tokensRequired;
}
