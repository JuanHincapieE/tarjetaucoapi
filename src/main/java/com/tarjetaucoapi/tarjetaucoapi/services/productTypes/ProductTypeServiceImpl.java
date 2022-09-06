package com.tarjetaucoapi.tarjetaucoapi.services.productTypes;


import com.tarjetaucoapi.tarjetaucoapi.domains.productType.ProductType;
import com.tarjetaucoapi.tarjetaucoapi.repositories.productType.IProductTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductTypeServiceImpl implements IProductTypeService {

    @Autowired
    private IProductTypeRepository productTypeRepository;

    @Override
    @Transactional(readOnly = true)
    public List<ProductType> findAll() {
        return (List<ProductType>) productTypeRepository.findAll();
    }
}
