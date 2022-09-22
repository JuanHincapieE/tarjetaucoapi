package com.tarjetaucoapi.tarjetaucoapi.domains.product;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name= "producto")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProduct;
    @Column(name = "precio")
    private int productPrice;
    @Column(name = "descripcion")
    private String descripton;
    @Column(name = "nombre")
    private String productName;
    @Column(name = "id_tipo_producto")
    private int productType;

    public Product(int idProduct, String productName, int productPrice, String descripton, int productType) {
        this.idProduct = idProduct;
        this.productName = productName;
        this.productPrice = productPrice;
        this.descripton = descripton;
        this.productType = productType;
    }

    public Product() {

    }

    public int getIdProduct() {
        return idProduct;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public String getDescripton() {
        return descripton;
    }

    public int getProductType() {
        return productType;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public void setDescripton(String descripton) {
        this.descripton = descripton;
    }

    public void setProductType(int productType) {
        this.productType = productType;
    }
}
