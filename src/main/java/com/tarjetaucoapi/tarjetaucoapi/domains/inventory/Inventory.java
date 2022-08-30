package com.tarjetaucoapi.tarjetaucoapi.domains.inventory;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="inventario")
public class Inventory {
    @Id
    private int id;
    @Column(name = "unidades_disponibles")
    private int availableUnits;
    @Column(name = "id_producto")
    private int productId;

    public Inventory(int id, int availableUnits, int productId) {
        this.id = id;
        this.availableUnits = availableUnits;
        this.productId = productId;
    }

    public Inventory() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAvailableUnits() {
        return availableUnits;
    }

    public void setAvailableUnits(int availableUnits) {
        this.availableUnits = availableUnits;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }
}
