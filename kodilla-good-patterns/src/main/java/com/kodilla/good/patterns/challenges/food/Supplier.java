package com.kodilla.good.patterns.challenges.food;

import java.util.Map;

public class Supplier {
    String supplier;

    public Supplier(String supplier) {
        this.supplier = supplier;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "supplier='" + supplier + '\'' +
                '}';
    }

}
