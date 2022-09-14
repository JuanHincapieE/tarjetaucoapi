package com.tarjetaucoapi.tarjetaucoapi.controllers.productType;

import com.tarjetaucoapi.tarjetaucoapi.domains.inventory.Inventory;
import com.tarjetaucoapi.tarjetaucoapi.domains.productType.ProductType;
import com.tarjetaucoapi.tarjetaucoapi.services.productTypes.IProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/rest")
public class ProductTypeController {

    @Autowired
    private IProductTypeService productTypeService;

    @GetMapping("/producttype")
    public List<ProductType> index(){
        return productTypeService.findAll();
    }

    @GetMapping("/producttype/{id}")
    public ProductType show(@PathVariable int id){
        return productTypeService.findById(id);
    }

    @PostMapping("/producttype")
    @ResponseStatus(HttpStatus.CREATED)
    public ProductType create(@RequestBody ProductType productType){
        return productTypeService.save(productType);
    }

    @PutMapping("/producttype/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public ProductType update(@RequestBody ProductType productType, int id){
        ProductType currentProductType = productTypeService.findById(id);

        currentProductType.setName(productType.getName());
        currentProductType.setDescription(productType.getDescription());

        return productTypeService.save(currentProductType);
    }

    @DeleteMapping("/producttype/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable int id){
        productTypeService.delete(id);
    }
}
