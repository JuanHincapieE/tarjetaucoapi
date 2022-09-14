package com.tarjetaucoapi.tarjetaucoapi.controllers.inventory;
<<<<<<< HEAD


=======
>>>>>>> 1b7d911aca6c26594217a2e5a960836be2161208
import com.tarjetaucoapi.tarjetaucoapi.domains.inventory.Inventory;
import com.tarjetaucoapi.tarjetaucoapi.services.inventories.IInventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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

    @PostMapping("/inventories")
    @ResponseStatus(HttpStatus.CREATED)
    public Inventory create(@RequestBody Inventory inventory){
        return inventoryService.save(inventory);
    }

    @PutMapping("/inventories/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Inventory update(@RequestBody Inventory inventory, int id){
        Inventory currentInventory = inventoryService.findById(id);

        currentInventory.setAvailableUnits(inventory.getAvailableUnits());

        return inventoryService.save(currentInventory);
    }

    @DeleteMapping("/inventories/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable int id){
        inventoryService.delete(id);
    }
}


