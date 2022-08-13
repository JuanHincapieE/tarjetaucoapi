package com.tarjetaucoapi.tarjetaucoapi.controller.inventory;


import com.tarjetaucoapi.tarjetaucoapi.core.inventory.model.InventoryModel;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/rest")

public class InventoryController {

    @GetMapping("/inventories")
    public InventoryModel getInventory() {
        InventoryModel inventoryModel = new InventoryModel(1, "tienda colegio");
        return inventoryModel;
    }

    @PostMapping("/inventories")
    public String  postInventory(@RequestParam(required = true) String idProduct, String productName, String productType, String idStore, String storeName){
        return "Estoy creando un inventario";
    }
}


