package com.tarjetaucoapi.tarjetaucoapi.services.inventories;

import com.tarjetaucoapi.tarjetaucoapi.domains.inventory.Inventory;

import java.util.List;

public interface IInventoryService {
    List<Inventory> findAll();

    public Inventory findById(int id);

    public Inventory save(Inventory inventory);

    public void delete(int id);

}
