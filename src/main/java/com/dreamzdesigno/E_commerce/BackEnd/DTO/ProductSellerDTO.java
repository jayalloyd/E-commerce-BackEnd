package com.dreamzdesigno.E_commerce.BackEnd.DTO;

public class ProductSellerDTO {
    private String productName;
    private String productCategory;
    private String productSize;
    private Long productCost;
    private String sellerName;
    private String sellerLocation;

    public String getSellerLocation() {
        return sellerLocation;
    }

    public void setSellerLocation(String sellerLocation) {
        this.sellerLocation = sellerLocation;
    }


    private double discountOffered;

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

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public double getDiscountOffered() {
        return discountOffered;
    }

    public void setDiscountOffered(double discountOffered) {
        this.discountOffered = discountOffered;
    }

    @Override
    public String toString() {
        return "ProductSellerDTO{" +
                "productName='" + productName + '\'' +
                ", productCategory='" + productCategory + '\'' +
                ", productSize='" + productSize + '\'' +
                ", productCost=" + productCost +
                ", sellerName='" + sellerName + '\'' +
                ", sellerLocation='" + sellerLocation + '\'' +
                ", discountOffered=" + discountOffered +
                '}';
    }
}