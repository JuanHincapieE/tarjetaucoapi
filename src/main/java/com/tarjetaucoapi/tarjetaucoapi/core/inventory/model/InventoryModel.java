package com.tarjetaucoapi.tarjetaucoapi.core.inventory.model;

public class InventoryModel {
    private int idStore;
    private String storeName;

    public InventoryModel(int idStore, String storeName) {
        this.idStore = idStore;
        this.storeName = storeName;
    }

    public int getIdStore() {
        return idStore;
    }

    public void setIdStore(int idStore) {
        this.idStore = idStore;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }
}
