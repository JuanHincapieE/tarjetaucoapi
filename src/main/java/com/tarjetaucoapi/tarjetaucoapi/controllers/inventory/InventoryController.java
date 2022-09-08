package com.tarjetaucoapi.tarjetaucoapi.controllers.inventory;


import com.tarjetaucoapi.tarjetaucoapi.domains.inventory.Inventory;
import com.tarjetaucoapi.tarjetaucoapi.services.inventories.IInventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/rest")
public class InventoryController {
    @Autowired
    private IInventoryService inventoryService;

    @GetMapping("/inventories")
    public List<Inventory> index(){
        return inventoryService.findAll();
    }

    @GetMapping("/inventories/{id}")
    public Inventory show(@PathVariable int id){
        return inventoryService.findById(id);
    }
    @PostMapping("/clientes")
    public Inventory create(@RequestBody Inventory inventory){
        return inventoryService.save(inventory);
    }

}


