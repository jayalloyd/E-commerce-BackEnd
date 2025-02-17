package com.dreamzdesigno.E_commerce.BackEnd.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="Seller")
public class Seller {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sellerId;
    private String sellerName;
    private String sellerLocation;
    private double discountOffered;

    @OneToMany(mappedBy = "seller", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Product> products;  // One seller has multiple products

    // Getters and Setters


    public int getSellerId() {
        return sellerId;
    }

    public void setSellerId(int sellerId) {
        this.sellerId = sellerId;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getSellerLocation() {
        return sellerLocation;
    }

    public void setSellerLocation(String sellerLocation) {
        this.sellerLocation = sellerLocation;
    }

    public double getDiscountOffered() {
        return discountOffered;
    }

    public void setDiscountOffered(double discountOffered) {
        this.discountOffered = discountOffered;
    }

    @Override
    public String toString() {
        return "Seller{" +
                "sellerId=" + sellerId +
                ", sellerName='" + sellerName + '\'' +
                ", sellerLocation='" + sellerLocation + '\'' +
                ", discountOffered=" + discountOffered +
                '}';
    }
}
