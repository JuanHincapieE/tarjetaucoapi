package com.tarjetaucoapi.tarjetaucoapi.domains.purchase;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "compra")
public class Purchase {
    @Id
    private int id;

    @Column(name = "consecutivo")
    private int consecutive;

    @Column(name = "cantidad")
    private int amount;

    @Column(name = "id_producto")
    private int productId;

    public Purchase(int id, int consecutive, int amount, int productId) {
        this.id = id;
        this.consecutive = consecutive;
        this.amount = amount;
        this.productId = productId;
    }
    public Purchase() {

    }

    public int getId() {
        return id;
    }

    public int getConsecutive() {
        return consecutive;
    }

    public int getAmount() {
        return amount;
    }

    public int getProductId() {
        return productId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setConsecutive(int consecutive) {
        this.consecutive = consecutive;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }
}
