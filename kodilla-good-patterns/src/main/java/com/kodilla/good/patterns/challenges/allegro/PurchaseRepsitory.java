package com.kodilla.good.patterns.challenges.allegro;

import java.util.Map;

public class PurchaseRepsitory implements OrderChecker{


    @Override
    public void order(Buyer buyer, Map<Product, Integer> products) {
        System.out.println("Your new order: "+ products);

    }
}
