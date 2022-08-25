package com.tarjetaucoapi.tarjetaucoapi.core.inventory.model;

import com.tarjetaucoapi.tarjetaucoapi.core.product.model.ProductModel;

public class InventoryModel {
    private int id;
    private int unidadesDisponibles;
    private ProductModel productoId;

    public InventoryModel(int id, int unidadesDisponibles, ProductModel productoId) {
        this.id = id;
        this.unidadesDisponibles = unidadesDisponibles;
        this.productoId = productoId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUnidadesDisponibles() {
        return unidadesDisponibles;
    }

    public void setUnidadesDisponibles(int unidadesDisponibles) {
        this.unidadesDisponibles = unidadesDisponibles;
    }

    public ProductModel getProductoId() {
        return productoId;
    }

    public void setProductoId(ProductModel productoId) {
        this.productoId = productoId;
    }
}
