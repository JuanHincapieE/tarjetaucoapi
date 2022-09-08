package com.tarjetaucoapi.tarjetaucoapi.services.purchase;

import com.tarjetaucoapi.tarjetaucoapi.domains.purchase.Purchase;
import com.tarjetaucoapi.tarjetaucoapi.repositories.store.inventory.Inventory;

import java.util.List;

public interface IPurchaseService {
    List<Purchase> findAll();
}
