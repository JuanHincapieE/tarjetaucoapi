package com.tarjetaucoapi.tarjetaucoapi.controllers.product;
import com.tarjetaucoapi.tarjetaucoapi.services.product.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.tarjetaucoapi.tarjetaucoapi.domains.product.Product;

import java.util.List;

@RestController
@RequestMapping("/api/v1/rest")
public class ProductController {

    @Autowired
    private IProductService productService;

    @GetMapping("/purchases")
    public List<Product> index() {
        return productService.findAll();
    }
}
