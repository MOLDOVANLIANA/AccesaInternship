package com.example.accesainternship.entities;

import com.example.accesainternship.constraints.Categories;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Test {
    @Id
    @GeneratedValue
    private int id;
    private Categories category;
    private String title;
    @ManyToOne(fetch=FetchType.EAGER)
    private Person author;
    @OneToMany(fetch=FetchType.EAGER)
    private List<Question> questions;
}
