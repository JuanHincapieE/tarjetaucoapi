package com.tarjetaucoapi.tarjetaucoapi.controllers.store;

import com.tarjetaucoapi.tarjetaucoapi.domains.inventory.Inventory;
import com.tarjetaucoapi.tarjetaucoapi.domains.store.Store;
import com.tarjetaucoapi.tarjetaucoapi.services.inventories.IInventoryService;
import com.tarjetaucoapi.tarjetaucoapi.services.stores.IStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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

    @GetMapping("/store/{id}}")
    public Store show(@PathVariable int id){
        return storeService.findById(id);
    }

    @PostMapping("/stores")
    @ResponseStatus(HttpStatus.CREATED)
    public Store create(@RequestBody Store store){
        return storeService.save(store);
    }

    @PutMapping("/stores/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Store update(@RequestBody Store store, int id){
        Store currentStore = storeService.findById(id);
        currentStore.setName(store.getName());
        return storeService.save(currentStore);
    }

    @DeleteMapping("/stores/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable int id){
        storeService.delete(id);
    }
}
