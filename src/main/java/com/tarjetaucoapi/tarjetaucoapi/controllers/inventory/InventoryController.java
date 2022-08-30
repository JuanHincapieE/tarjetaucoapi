package com.tarjetaucoapi.tarjetaucoapi.controllers.inventory;


import com.tarjetaucoapi.tarjetaucoapi.domains.inventory.Inventory;
import com.tarjetaucoapi.tarjetaucoapi.domains.product.Product;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/rest")
public class InventoryController {

    @GetMapping("/inventories")
    public Inventory getInventory() {
        return new Inventory(1, 15, 1);
    }

    @PostMapping("/inventories")
    public String  postInventory(@RequestParam(required = true) String idProduct, String productName, String productType, String idStore, String storeName){
        return "Estoy creando un inventario";
    }
}


