package com.tarjetaucoapi.tarjetaucoapi.services.purchase;


import com.tarjetaucoapi.tarjetaucoapi.domains.purchase.Purchase;
import com.tarjetaucoapi.tarjetaucoapi.repositories.purchase.IPurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class PurchaseServiceImpl implements IPurchaseService {
    @Autowired
    private IPurchaseRepository purchaseRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Purchase> findAll() {
        return (List<Purchase>) purchaseRepository.findAll();
    }
}
