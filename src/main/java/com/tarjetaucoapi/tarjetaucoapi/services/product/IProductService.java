package com.tarjetaucoapi.tarjetaucoapi.services.product;

import com.tarjetaucoapi.tarjetaucoapi.domains.product.Product;


import java.util.List;

public interface IProductService {
    List<Product> findAll();

    Product findById(int id);

    Product save(Product product);

    void delete(int id);
}
