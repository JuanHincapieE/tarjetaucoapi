package com.tarjetaucoapi.tarjetaucoapi.controllers.purchase;


import com.tarjetaucoapi.tarjetaucoapi.domains.purchase.Purchase;
import com.tarjetaucoapi.tarjetaucoapi.services.purchase.IPurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/rest")
public class PurchaseController {
    @Autowired
    private IPurchaseService purchaseService;

    @GetMapping("/purchase")
    public List<Purchase> index(){
        return purchaseService.findAll();
    }

    @GetMapping("/purchase/{id}")
    public Purchase show(@PathVariable int id){
        return purchaseService.findById(id);
    }

    @PostMapping("/purchase")
    @ResponseStatus(HttpStatus.CREATED)
    public Purchase create(@RequestBody Purchase purchase){
        return purchaseService.save(purchase);
    }

    @PutMapping("/purchase/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Purchase update(@RequestBody Purchase purchase, int id){
        Purchase currentPurchase = purchaseService.findById(id);
        currentPurchase.setAmount(purchase.getAmount());
        currentPurchase.setConsecutive(purchase.getConsecutive());
        return purchaseService.save(currentPurchase);
    }

    @DeleteMapping("/purchase/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable int id){
        purchaseService.delete(id);
    }


}
