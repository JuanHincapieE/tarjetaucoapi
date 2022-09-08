package com.tarjetaucoapi.tarjetaucoapi.controllers.purchase;


import com.tarjetaucoapi.tarjetaucoapi.domains.purchase.Purchase;
import com.tarjetaucoapi.tarjetaucoapi.services.purchase.IPurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/rest")
public class PurchaseController {
    @Autowired
    private IPurchaseService purchaseService;

    @GetMapping("/purchases")
    public List<Purchase> index() {
        return purchaseService.findAll();
    }


}
