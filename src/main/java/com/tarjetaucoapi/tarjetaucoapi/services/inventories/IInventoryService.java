package com.tarjetaucoapi.tarjetaucoapi.services.inventories;

import com.tarjetaucoapi.tarjetaucoapi.domains.inventory.Inventory;

import java.util.List;

public interface IInventoryService {
    public List<Inventory> findAll();

}
