package com.kodilla.good.patterns.challenges.food;

public class Purchase {

    int count;

    public Purchase(Product product, int count, Buyer buyer) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "count=" + count +
                '}';
    }
}
