package com.tarjetaucoapi.tarjetaucoapi.domains.store;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tienda")
public class Store {
    @Id
    private int id;
    @Column(name="nombre")
    private String name;
    @Column(name="id_producto")
    private int idProduct;
    @Column(name="id_inventario")
    private int idInventory;
    @Column(name="id_historial")
    private int idRecord;


    public Store() {
    }

    public Store(int id, String name, int idProduct, int idInventory, int idRecord) {
        this.id = id;
        this.name = name;
        this.idProduct = idProduct;
        this.idInventory = idInventory;
        this.idRecord = idRecord;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProducto) {
        this.idProduct = idProducto;
    }

    public int getIdInventory() {
        return idInventory;
    }

    public void setIdInventory(int idInventory) {
        this.idInventory = idInventory;
    }

    public int getIdRecord() {
        return idRecord;
    }

    public void setIdRecord(int idRecord) {
        this.idRecord = idRecord;
    }
}
