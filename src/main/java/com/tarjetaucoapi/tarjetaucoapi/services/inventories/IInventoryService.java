package com.tarjetaucoapi.tarjetaucoapi.services.inventories;

import com.tarjetaucoapi.tarjetaucoapi.domains.inventory.Inventory;

import java.util.List;

public interface  IInventoryService {
    List<Inventory> findAll();

    Inventory findById(int id);

    Inventory save(Inventory inventory);

    void delete(int id);

}
