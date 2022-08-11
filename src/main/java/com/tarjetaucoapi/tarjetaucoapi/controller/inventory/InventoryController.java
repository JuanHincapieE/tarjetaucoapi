package com.tarjetaucoapi.tarjetaucoapi.controller.inventory;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/rest")

public class InventoryController {

    @GetMapping("/inventories")
    public String  getPerson(@RequestParam(required = true) String idProduct, String productName, String productType, String idStore, String storeName) {
        return "Estoy retornando un inventario";
    }

    @PostMapping("/inventories")
    public String  pstPerson(@RequestParam(required = true) String idProduct, String productName, String productType, String idStore, String storeName){
        return "Estoy creando un inventario";
    }
}


