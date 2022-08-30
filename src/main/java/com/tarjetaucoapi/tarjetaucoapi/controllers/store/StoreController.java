package com.tarjetaucoapi.tarjetaucoapi.controllers.store;

import com.tarjetaucoapi.tarjetaucoapi.domains.store.model.Store;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/rest")

public class StoreController {

    @GetMapping("/stores")
    public Store storeModel() {
        Store storeModel= new Store(1,"Botarochitas","Tus platanitos al mejor precio");
        return storeModel;
    }

    @PostMapping("/stores")
    public String  postStore(@RequestParam(required = true) String id, String name, String description){
        return "Estoy creando una tienda!!!";
    }

}
