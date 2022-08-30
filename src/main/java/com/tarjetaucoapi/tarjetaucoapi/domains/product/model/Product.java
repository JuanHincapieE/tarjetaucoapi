package com.tarjetaucoapi.tarjetaucoapi.domains.product.model;

public class Product {

    private int idProduct;
    private String productName;
    private long productPrice;
    private String descripton;

    public Product(int idProduct, String productName, long productPrice, String descripton) {
        this.idProduct = idProduct;
        this.productName = productName;
        this.productPrice = productPrice;
        this.descripton = descripton;
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
