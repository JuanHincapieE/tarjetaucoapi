package com.tarjetaucoapi.tarjetaucoapi.controllers.productType;

import com.tarjetaucoapi.tarjetaucoapi.domains.productType.ProductType;
import com.tarjetaucoapi.tarjetaucoapi.services.productTypes.IProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
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


}
