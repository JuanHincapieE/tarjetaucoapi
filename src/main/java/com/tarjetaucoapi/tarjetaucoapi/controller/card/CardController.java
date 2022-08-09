package com.tarjetaucoapi.tarjetaucoapi.controller.card;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/rest")

public class CardController {
    @GetMapping("/cards")
    public String  getPerson(@RequestParam(required = true) String documentType, String documentNumber){

        return "Estoy retornando una tarjeta";

    }
}
