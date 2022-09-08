package com.tarjetaucoapi.tarjetaucoapi.services.product;

import com.tarjetaucoapi.tarjetaucoapi.domains.product.Product;


import java.util.List;

public interface IProductService {
    List<Product> findAll();
}
