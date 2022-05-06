package com.kodilla.good.patterns.challenges.allegro;

public class Product {
    String productName;
    int productNumber;


    public Product(String productName, int productNumber) {
        this.productName = productName;
        this.productNumber = productNumber;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductNumber() {
        return productNumber;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productNumber=" + productNumber +
                '}';
    }
}

