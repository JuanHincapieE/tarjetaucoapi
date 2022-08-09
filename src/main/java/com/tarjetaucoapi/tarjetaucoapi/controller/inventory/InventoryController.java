package com.tarjetaucoapi.tarjetaucoapi.controller.inventory;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/rest")

public class InventoryController {

    @GetMapping("/inventories")
    public String  getPerson(@RequestParam(required = true) String documentType, String documentNumber){

        return "Estoy retornando un inventario";

    }
}
