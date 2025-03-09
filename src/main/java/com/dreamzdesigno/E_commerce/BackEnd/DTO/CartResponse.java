package com.dreamzdesigno.E_commerce.BackEnd.DTO;

public class CartResponse {
    private String productName;
    private String productCategory;
    private String productSize;
    private Long productCost;
    private int productQuantity;

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
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
        return "CartResponse{" +
                "productName='" + productName + '\'' +
                ", productCategory='" + productCategory + '\'' +
                ", productSize='" + productSize + '\'' +
                ", productCost=" + productCost +
                ", productQuantity=" + productQuantity +
                '}';
    }
}
