package com.example.accesainternship.services;

import com.example.accesainternship.dtos.RegisterDTO;
import com.example.accesainternship.dtos.UsernameAndPassDTO;
import com.example.accesainternship.entities.Person;
import com.example.accesainternship.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PersonService {
    private final PersonRepository personRepository;
    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }


    public Person login(RegisterDTO credentials) {
         Person person=personRepository.findByUsernameAndPassword(credentials.getUsername(), credentials.getPassword());
        System.out.println(person);
         return person;
    }
    public Person register(RegisterDTO registerDTO) {
        Person person=Person.builder()
                .username(registerDTO.getUsername())
                .password(registerDTO.getPassword())
                .tokens(0)
                .build();
        personRepository.save(person);
        return person;
    }
}
