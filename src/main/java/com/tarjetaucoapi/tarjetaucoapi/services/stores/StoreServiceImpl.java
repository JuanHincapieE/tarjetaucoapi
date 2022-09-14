package com.tarjetaucoapi.tarjetaucoapi.services.stores;

import com.tarjetaucoapi.tarjetaucoapi.domains.store.Store;
import com.tarjetaucoapi.tarjetaucoapi.repositories.store.IStoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class StoreServiceImpl implements IStoreService{

    @Autowired
    private IStoreRepository storeRepository;


    @Override
    @Transactional(readOnly = true)
    public List<Store> findAll() {
        return (List<Store>) storeRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Store findById(int id) {
        return storeRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Store save(Store store) {
        return storeRepository.save(store);
    }
    @Override
    @Transactional
    public void delete(int id) {
        storeRepository.deleteById(id);
    }

}
