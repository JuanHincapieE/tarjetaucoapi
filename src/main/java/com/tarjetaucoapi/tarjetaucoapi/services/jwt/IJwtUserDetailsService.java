package com.tarjetaucoapi.tarjetaucoapi.services.jwt;

import com.tarjetaucoapi.tarjetaucoapi.domains.inventory.Inventory;

import java.util.List;

public interface IJwtUserDetailsService {
    List<User> findAll();

    Inventory findById(int id);

    Inventory save(Inventory inventory);

    void delete(int id);

}
