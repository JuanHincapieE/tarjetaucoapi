package com.tarjetaucoapi.tarjetaucoapi.controllers.productType;

import com.tarjetaucoapi.tarjetaucoapi.domains.productType.ProductType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/rest")
public class ProductTypeController {
    @GetMapping("/producttype")
    public ProductType getProductType() {
        return new ProductType(1, "Glacitas", "Las mejores galletas");
    }

    @PostMapping("/inventories")
    public String  postInventory(@RequestParam(required = true) int id, String name, String description){
        return "Estoy creando un tipo de producto";
    }
}
