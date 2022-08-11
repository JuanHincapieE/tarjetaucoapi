package com.tarjetaucoapi.tarjetaucoapi.controller.product;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/rest")
public class ProductController {
    @GetMapping("/products")
    public String  getPerson(@RequestParam(required = true) int idProducto, String nombreProducto){

        return "Estoy retornando un producto";
    }
    //POST | PUT | DELETE
}
