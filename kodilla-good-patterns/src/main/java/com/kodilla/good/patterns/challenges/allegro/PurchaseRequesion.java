package com.kodilla.good.patterns.challenges.allegro;

import java.util.HashMap;
import java.util.Map;

public class PurchaseRequesion {
    Map<Product, Integer> products = new HashMap<>();
    Buyer buyer;

    public void add(Product product, Integer count){
        products.put(product, count);
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public void setProducts(Map<Product, Integer> products) {
        this.products = products;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    @Override
    public String toString() {
        return "PurchaseRequesion{" +
                "products=" + products +
                ", buyer=" + buyer +
                '}';
    }
}
