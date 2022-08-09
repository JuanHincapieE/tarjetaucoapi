package com.tarjetaucoapi.tarjetaucoapi.controller.persons;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/rest")

public class PersonController {

    @GetMapping("/persons")
    public String  getPerson(@RequestParam(required = true) String documentType, String documentNumber){

        return "Estoy retornando una persona";

    }


}
