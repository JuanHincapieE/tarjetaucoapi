package com.tarjetaucoapi.tarjetaucoapi.controller.persons;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/rest")

public class PersonController {

    // REVISAR Y ARREGLAR LOS REQUESTPARAM DE CADA CLASE.
    @GetMapping("/persons")
    public String  getPerson(@RequestParam(required = true) String documentType, String documentNumber, String name,
                                String lastName, String email ){

        return "Estoy retornando una persona";
    }
    @PostMapping("/persons")
    public String postPerson(@RequestParam(required = true) String documentType, String documentNumber, String name,
                             String lastName, String email) {
        return "Estoy creando una persona";
    }

}
