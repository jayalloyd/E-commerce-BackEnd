package com.dreamzdesigno.E_commerce.BackEnd.model;

import com.dreamzdesigno.E_commerce.BackEnd.DTO.ProductSellerDTO;
import jakarta.persistence.*;



@Entity
@Table(name="EProduct")
public class Product extends ProductSellerDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;

    private String productName;
    private String productCategory;
    private String productSize;
    private Long productCost;


    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "sellerId", referencedColumnName = "sellerId")
    private Seller seller;


    // Getters and Setters


    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

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

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
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

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productCategory='" + productCategory + '\'' +
                ", productSize='" + productSize + '\'' +
                ", productCost=" + productCost +
                ", seller='" + seller + '\'' +
                '}';
    }
}
