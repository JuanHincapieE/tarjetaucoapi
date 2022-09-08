package com.tarjetaucoapi.tarjetaucoapi.services.product;
import com.tarjetaucoapi.tarjetaucoapi.domains.product.Product;
import com.tarjetaucoapi.tarjetaucoapi.repositories.product.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    private IProductRepository productRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Product> findAll() {
        return (List<Product>) productRepository.findAll();
    }


}
