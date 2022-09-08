package com.tarjetaucoapi.tarjetaucoapi.services.productTypes;

import com.tarjetaucoapi.tarjetaucoapi.domains.inventory.Inventory;
import com.tarjetaucoapi.tarjetaucoapi.domains.productType.ProductType;

import java.util.List;

public interface IProductTypeService {
    public List<ProductType> findAll();

    public ProductType findById(int id);

    public ProductType save(ProductType productType);

    public void delete(int id);
}
