package com.example.accesainternship.controller;

import com.example.accesainternship.dtos.RegisterDTO;
import com.example.accesainternship.dtos.UsernameAndPassDTO;
import com.example.accesainternship.entities.Person;
import com.example.accesainternship.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Objects;

@RestController
@CrossOrigin
@RequestMapping("/person")
public class PersonController {
    private final PersonService personService;
    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }
    @PostMapping("/login")
    public ResponseEntity login(@RequestBody RegisterDTO registerDTO){
        Person person = personService.login(registerDTO);
        return ResponseEntity.status(HttpStatus.OK).body(Objects.requireNonNullElse(person, "INVALID"));
    }
    @PostMapping("/register")
    public ResponseEntity<Person> register( @RequestBody RegisterDTO registerDTO)
    {
        return new ResponseEntity<>(personService.register(registerDTO), HttpStatus.CREATED);
    }
}
