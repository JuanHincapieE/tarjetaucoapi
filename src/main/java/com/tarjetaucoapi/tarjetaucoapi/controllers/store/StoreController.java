package com.tarjetaucoapi.tarjetaucoapi.controllers.store;

import com.tarjetaucoapi.tarjetaucoapi.domains.inventory.Inventory;
import com.tarjetaucoapi.tarjetaucoapi.domains.store.Store;
import com.tarjetaucoapi.tarjetaucoapi.services.inventories.IInventoryService;
import com.tarjetaucoapi.tarjetaucoapi.services.stores.IStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/rest")

public class StoreController {


    @Autowired
    private IStoreService storeService;

    @GetMapping("/store")
    public List<Store> index(){
        return storeService.findAll();
    }

    @GetMapping("/store/1")
    public Store storeById(){
        return storeService.findById(1);
    }


}
