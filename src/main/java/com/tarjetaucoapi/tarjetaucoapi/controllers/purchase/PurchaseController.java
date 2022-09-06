package com.tarjetaucoapi.tarjetaucoapi.controllers.purchase;


import com.tarjetaucoapi.tarjetaucoapi.domains.purchase.Purchase;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/rest")
public class PurchaseController {
    @GetMapping("/purchase")
    public Purchase purchaseModel() {
        Purchase productModel= new Purchase(1,1234,1500,1222345);
        return purchaseModel();
    }
    @PostMapping("/purchase")
    public String  postPurchase(@RequestParam(required = true) int idProduct, int consecutive, int amount, int productId){
        return "Estoy creando una compra";
    }
}
