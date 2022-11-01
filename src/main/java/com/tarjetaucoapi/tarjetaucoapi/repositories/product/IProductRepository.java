package com.tarjetaucoapi.tarjetaucoapi.repositories.product;

import com.tarjetaucoapi.tarjetaucoapi.domains.product.Product;
import org.springframework.data.repository.CrudRepository;

public interface IProductRepository extends CrudRepository<Product, Integer> {
}
