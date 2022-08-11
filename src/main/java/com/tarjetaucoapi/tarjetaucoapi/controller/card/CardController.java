package com.tarjetaucoapi.tarjetaucoapi.controller.card;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/rest")

public class CardController {

    //, USERNAME, USERLASTNAME, CVV, EXPIRATION
    @GetMapping("/cards")
    public String  getcard(@RequestParam(required = true) int CardNumber, String UserName,
                             String UserLastName, int CVV, int Expiration){

        return "Estoy retornando una tarjeta a";

    }
    @PostMapping("/cards")
    public String postcard(@RequestParam(required = true) int CardNumber, String UserName,
                             String UserLastName, int CVV, int Expiration){

        return "estoy creando una tarjeta";
    }
}
