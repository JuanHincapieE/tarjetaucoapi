package com.tarjetaucoapi.tarjetaucoapi.services.inventories;

import com.tarjetaucoapi.tarjetaucoapi.repositories.store.inventory.Inventory;
import com.tarjetaucoapi.tarjetaucoapi.repositories.inventory.IInventoryRepository;
import com.tarjetaucoapi.tarjetaucoapi.services.inventories.IInventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class InventoryServiceImpl implements IInventoryService {
    @Autowired
    private IInventoryRepository inventoryRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Inventory> findAll() { return (List<Inventory>) inventoryRepository.findAll(); }
}
