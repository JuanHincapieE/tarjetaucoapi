package com.tarjetaucoapi.tarjetaucoapi.services.purchase;


import com.tarjetaucoapi.tarjetaucoapi.domains.purchase.Purchase;


import java.util.List;

public interface IPurchaseService {
    List<Purchase> findAll();
    Purchase findById(int id);

    Purchase save(Purchase purchase);

    void delete(int id);
}
