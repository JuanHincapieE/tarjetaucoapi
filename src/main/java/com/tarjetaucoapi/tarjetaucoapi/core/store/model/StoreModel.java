package com.tarjetaucoapi.tarjetaucoapi.core.store.model;

public class StoreModel {
    private int id;
    private String name;
    private String description;

    public StoreModel(int id, String name, String description){
        this.id=id;
        this.name=name;
        this.description=description;
    }

    public int getStoreId() {
        return id;
    }

    public String getStoreName() {
        return name;
    }

    public String getStoreDescription() {
        return description;
    }

    public void setStoreId(int id) {
        this.id = id;
    }

    public void setStoreName(String name) {
        this.name = name;
    }

    public void setStoreDescription(String description) {
        this.description = description;
    }
}
