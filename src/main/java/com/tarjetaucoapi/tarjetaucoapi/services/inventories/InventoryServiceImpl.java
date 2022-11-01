package com.tarjetaucoapi.tarjetaucoapi.services.inventories;

import com.tarjetaucoapi.tarjetaucoapi.domains.inventory.Inventory;
import com.tarjetaucoapi.tarjetaucoapi.repositories.inventory.IInventoryRepository;
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

    @Override
    @Transactional(readOnly = true)
    public Inventory findById(int id) {
        return inventoryRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Inventory save(Inventory inventory) {
        return inventoryRepository.save(inventory);
    }

    @Override
    @Transactional
    public void delete(int id) {
        inventoryRepository.deleteById(id);
    }
}
