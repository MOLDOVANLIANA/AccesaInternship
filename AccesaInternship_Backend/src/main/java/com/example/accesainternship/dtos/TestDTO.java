package com.example.accesainternship.dtos;
import com.example.accesainternship.constraints.Categories;
import com.example.accesainternship.entities.Person;
import lombok.Data;

@Data
public class TestDTO {
    private String title;
    private Long authorId;
    private Categories category;
}
