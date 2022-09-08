package com.tarjetaucoapi.tarjetaucoapi.repositories.purchase;

import com.tarjetaucoapi.tarjetaucoapi.domains.purchase.Purchase;
import org.springframework.data.repository.CrudRepository;

public interface IPurchaseRepository extends CrudRepository<Purchase, Integer> {
}
