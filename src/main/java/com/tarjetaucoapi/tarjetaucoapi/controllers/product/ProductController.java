package com.tarjetaucoapi.tarjetaucoapi.controllers.product;
import com.tarjetaucoapi.tarjetaucoapi.domains.product.Product;

import com.tarjetaucoapi.tarjetaucoapi.services.product.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/v1/rest")
public class ProductController {

    @Autowired
    private IProductService productService;

    @GetMapping("/product")
    public List<Product> index(){
        return productService.findAll();
    }

    @GetMapping("/product/{id}")
    public List<Product> show(@PathVariable int id){
        return productService.findAll();
    }

    @PostMapping("/product")
    @ResponseStatus(HttpStatus.CREATED)
    public Product create(@RequestBody Product product){
        return productService.save(product);
    }

    @PutMapping("/product/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Product update(@RequestBody Product product, int id){
        Product currentProduct = productService.findById(id);
        currentProduct.setProductName(product.getProductName());
        currentProduct.setIdProduct(product.getIdProduct());
        return productService.save(currentProduct);
    }

    @DeleteMapping("/product/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable int id){
        productService.delete(id);
    }
}
