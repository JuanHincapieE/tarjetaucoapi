package com.tarjetaucoapi.tarjetaucoapi.services.stores;
import com.tarjetaucoapi.tarjetaucoapi.domains.store.Store;
import java.util.List;

public interface IStoreService {
    public List<Store> findAll();

    public Store findById(int id);
}
