package com.tarjetaucoapi.tarjetaucoapi.repositories.inventory;

import com.tarjetaucoapi.tarjetaucoapi.repositories.store.inventory.Inventory;
import org.springframework.data.repository.CrudRepository;


public interface IInventoryRepository extends CrudRepository<Inventory, Integer> {

}
