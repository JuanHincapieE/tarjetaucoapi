package com.tarjetaucoapi.tarjetaucoapi.controller.store;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/rest")

public class StoreController {

    @GetMapping("/stores")
    public String  getStore(@RequestParam(required = true) String documentType, String documentNumber){

        return "Estoy retornando la tiendaa" + documentNumber ;

    }

}
