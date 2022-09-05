package com.tarjetaucoapi.tarjetaucoapi.domains.product;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "producto")
public class Product {
    @Id
    private int idProduct;
    @Column(name = "nombre")
    private String productName;
    @Column(name = "precio")
    private long productPrice;
    @Column(name = "descripcion")
    private String descripton;

    public Product(int idProduct, String productName, long productPrice, String descripton) {
        this.idProduct = idProduct;
        this.productName = productName;
        this.productPrice = productPrice;
        this.descripton = descripton;
    }

    public Product() {

    }

    public int getIdProduct() {
        return idProduct;
    }

    public String getProductName() {
        return productName;
    }

    public long getProductPrice() {
        return productPrice;
    }

    public String getDescripton() {
        return descripton;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductPrice(long productPrice) {
        this.productPrice = productPrice;
    }

    public void setDescripton(String descripton) {
        this.descripton = descripton;
    }
}
