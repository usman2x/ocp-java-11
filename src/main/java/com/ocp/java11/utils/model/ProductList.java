package com.ocp.java11.utils.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

public class ProductList implements Serializable {
    LocalDateTime date = LocalDateTime.now();
    private List<Product> productList;

    public ProductList(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public String toString() {
        return "ProductList{" +
                "date=" + date +
                ", productList=" + productList +
                '}';
    }
}
