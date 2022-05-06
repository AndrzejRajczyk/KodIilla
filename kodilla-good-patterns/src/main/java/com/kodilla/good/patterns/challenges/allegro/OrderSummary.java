package com.kodilla.good.patterns.challenges.allegro;

public class OrderSummary {
    Buyer buyer;
    boolean isOrder;

    public OrderSummary(Buyer buyer, boolean isOrder) {
        this.buyer = buyer;
        this.isOrder = isOrder;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public boolean isOrder() {
        return isOrder;
    }
}
