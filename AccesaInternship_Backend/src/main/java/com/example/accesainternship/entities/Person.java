package com.example.accesainternship.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.UUID;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Person {
    @Id
    @GeneratedValue
    private Long id;
    private String username;
    private String password;
    @OneToOne()
    private Badge badge;
    private int tokens;

}
