package com.tarjetaucoapi.tarjetaucoapi.controller.inventory;


import com.tarjetaucoapi.tarjetaucoapi.core.inventory.model.InventoryModel;
import com.tarjetaucoapi.tarjetaucoapi.core.product.model.ProductModel;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/rest")

public class InventoryController {

    @GetMapping("/inventories")
    public InventoryModel getInventory() {
        return new InventoryModel(1, 15, new ProductModel(123, "Papitas", 3000, "Son unas papitas"));
    }

    @PostMapping("/inventories")
    public String  postInventory(@RequestParam(required = true) String idProduct, String productName, String productType, String idStore, String storeName){
        return "Estoy creando un inventario";
    }
}


