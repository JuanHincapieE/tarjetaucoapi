package com.tarjetaucoapi.tarjetaucoapi.repositories.store.inventory;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name ="inventario")
public class Inventory implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "unidades_disponibles")
    private int availableUnits;
    @Column(name = "id_producto")
    private int productId;

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

    private static final long serialVersionUID = 1L;
}
