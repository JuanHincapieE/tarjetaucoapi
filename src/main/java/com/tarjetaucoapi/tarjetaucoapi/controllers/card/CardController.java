package com.tarjetaucoapi.tarjetaucoapi.controllers.card;


import com.tarjetaucoapi.tarjetaucoapi.domains.card.Card;
import com.tarjetaucoapi.tarjetaucoapi.services.card.ICardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/api/v1/rest")

public class CardController {

    @Autowired
    private ICardService cardService;

    @GetMapping("/cards")
    public List<Card> index() {
        return cardService.findAll();

    }

    @GetMapping("/cards/{id}")
    public Card show(@PathVariable int id ) {return cardService.findById(id);}



    @PostMapping("/cards")
    @ResponseStatus(HttpStatus.CREATED)
    public Card create(@RequestBody Card card){return cardService.save(card);
    }

    /*@PutMapping("/inventories/{id}")a
    @ResponseStatus(HttpStatus.CREATED)a
    public Inventory update(@RequestBody Inventory inventory, int id){
        Inventory currentInventory = inventoryService.findById(id);

        currentInventory.setAvailableUnits(inventory.getAvailableUnits());

        return inventoryService.save(currentInventory);*/

    @DeleteMapping("/cards{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable int id) {cardService.delete(id);}


}
