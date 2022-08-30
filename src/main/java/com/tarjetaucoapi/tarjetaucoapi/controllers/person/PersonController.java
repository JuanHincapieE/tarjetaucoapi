package com.tarjetaucoapi.tarjetaucoapi.controllers.person;

import com.tarjetaucoapi.tarjetaucoapi.domains.person.model.Person;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/rest")

public class PersonController {

    // REVISAR Y ARREGLAR LOS REQUESTPARAM DE CADA CLASE.
    /*@GetMapping("/persons")
    public Person getPerson() {

        Person personModel = new Person(1,"26607565","Julio","Salas","lordhokage@gmail.com",
                "texas",);

        return personModel;
    }*/
    @PostMapping("/persons")
    public String postPerson(@RequestParam(required = true) String documentType, String documentNumber, String name,
                             String lastName, String email) {
        return "Estoy creando una persona";
    }

}
