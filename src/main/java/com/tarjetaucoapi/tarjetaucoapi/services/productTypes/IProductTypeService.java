package com.tarjetaucoapi.tarjetaucoapi.services.productTypes;

import com.tarjetaucoapi.tarjetaucoapi.domains.inventory.Inventory;
import com.tarjetaucoapi.tarjetaucoapi.domains.productType.ProductType;

import java.util.List;

public interface IProductTypeService {
    List<ProductType> findAll();

    ProductType findById(int id);

    ProductType save(ProductType productType);

    void delete(int id);
}
