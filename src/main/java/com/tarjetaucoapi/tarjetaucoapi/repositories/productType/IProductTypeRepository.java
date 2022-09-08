package com.tarjetaucoapi.tarjetaucoapi.repositories.productType;

import com.tarjetaucoapi.tarjetaucoapi.domains.productType.ProductType;
import org.springframework.data.repository.CrudRepository;

public interface IProductTypeRepository extends CrudRepository<ProductType, Integer> {
}
