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

}


