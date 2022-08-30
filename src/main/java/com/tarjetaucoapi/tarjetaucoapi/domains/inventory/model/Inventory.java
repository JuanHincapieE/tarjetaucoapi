package com.tarjetaucoapi.tarjetaucoapi.domains.inventory.model;

import com.tarjetaucoapi.tarjetaucoapi.domains.product.model.Product;

public class Inventory {
    private int id;
    private int unidadesDisponibles;
    private Product productoId;

    public Inventory(int id, int unidadesDisponibles, Product productoId) {
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

    public Product getProductoId() {
        return productoId;
    }

    public void setProductoId(Product productoId) {
        this.productoId = productoId;
    }
}
