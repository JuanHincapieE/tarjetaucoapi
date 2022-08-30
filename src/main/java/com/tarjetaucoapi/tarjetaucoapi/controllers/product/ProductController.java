package com.tarjetaucoapi.tarjetaucoapi.controllers.product;

import org.springframework.web.bind.annotation.*;
import com.tarjetaucoapi.tarjetaucoapi.domains.product.Product;

@RestController
@RequestMapping("/api/v1/rest")
public class ProductController {
    @GetMapping("/products")
    public Product productModel() {
        Product productModel= new Product(1,"Agua",1500,"Botella de agua 100 ml");
        return productModel;
    }

    @PostMapping("/products")
    public String  postProduct(@RequestParam(required = true) String idProduct, String productName,long productPrice, String description){
        return "Estoy creando un producto";
    }
}
