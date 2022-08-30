package com.tarjetaucoapi.tarjetaucoapi.controllers.card;


import com.tarjetaucoapi.tarjetaucoapi.domains.card.Card;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@RestController
@RequestMapping("/api/v1/rest")

public class CardController {

    //, CardNumber, USERNAME, USERLASTNAME, CVV, EXPIRATION
    @GetMapping("/cards")
    public Card getcard() {
        Random random = new Random();

        Card cardModel = new Card(random.nextInt(13),"Julio");

        return cardModel;

    }
    @PostMapping("/cards")
    public String postcard(@RequestParam(required = true) int CardNumber, String UserName,
                             String UserLastName, int CVV, int Expiration){

        return "estoy creando una tarjeta a";
    }
}
