package com.tarjetaucoapi.tarjetaucoapi.services.productTypes;

import com.tarjetaucoapi.tarjetaucoapi.domains.productType.ProductType;

import java.util.List;

public interface IProductTypeService {
    public List<ProductType> findAll();
}
