package com.tarjetaucoapi.tarjetaucoapi.controllers.person;

import com.tarjetaucoapi.tarjetaucoapi.domains.person.Person;
import com.tarjetaucoapi.tarjetaucoapi.repositories.person.IPersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/rest")

public class PersonController {
    @GetMapping("/persons")
    public Person getPerson() {

        Person personEntity = new Person(1,"1036960741","Julio","Salas","lordhokage@gmail.com",
                "texas","jefe",1);

        return personEntity;
    }
    @PostMapping("/persons")
    public String postPerson(@RequestParam(required = true) int id, String identification, String name,
                             String lastName, String personalEmail, String address, String charge, int idCard) {
        return "Estoy creando una persona";
    }

}
