package com.ocp.java11.utils.model;

import java.io.Serializable;

public class Product implements Serializable {
    private int productId;
    private String productDescription;

    public Product(int productId, String productDescription) {
        this.productId = productId;
        this.productDescription = productDescription;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productDescription='" + productDescription + '\'' +
                '}';
    }
}
