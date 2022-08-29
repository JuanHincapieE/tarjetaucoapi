package com.tarjetaucoapi.tarjetaucoapi.controller.store;

import com.tarjetaucoapi.tarjetaucoapi.core.product.model.ProductModel;
import com.tarjetaucoapi.tarjetaucoapi.core.store.model.StoreModel;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/rest")

public class StoreController {

    @GetMapping("/stores")
    public StoreModel storeModel() {
        StoreModel storeModel= new StoreModel(1,"Botarochitas","Tus platanitos al mejor precio");
        return storeModel;
    }

    @PostMapping("/stores")
    public String  postStore(@RequestParam(required = true) String id, String name, String description){
        return "Estoy creando una tienda!!!";
    }

}
