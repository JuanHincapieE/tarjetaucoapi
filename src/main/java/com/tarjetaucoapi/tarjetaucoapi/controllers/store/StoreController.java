package com.tarjetaucoapi.tarjetaucoapi.controllers.store;

import com.tarjetaucoapi.tarjetaucoapi.domains.store.Store;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/rest")

public class StoreController {

    @GetMapping("/stores")
    public Store getStore() {
        Store store= new Store(1,"Botarochitas",1,1,1);
        return store;
    }

    @PostMapping("/stores")
    public String  postStore(@RequestParam(required = true) String id, String name, int idProduct, int idInventory, int idRecord){
        return "Estoy creando una tienda!!!";
    }

}
