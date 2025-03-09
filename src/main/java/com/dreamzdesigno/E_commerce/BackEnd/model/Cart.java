package com.dreamzdesigno.E_commerce.BackEnd.model;

import jakarta.persistence.*;

@Entity
@Table(name="Cart")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;

    private String productName;
    private String productSize;
    private Long productCost;
    private int productQuantity;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductSize() {
        return productSize;
    }

    public void setProductSize(String productSize) {
        this.productSize = productSize;
    }

    public Long getProductCost() {
        return productCost;
    }

    public void setProductCost(Long productCost) {
        this.productCost = productCost;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productSize='" + productSize + '\'' +
                ", productCost=" + productCost +
                ", productQuantity=" + productQuantity +
                '}';
    }
}
