package com.kodilla.good.patterns.challenges.allegro;

import java.util.Map;

public class Email implements InformationService {




    @Override
    public void inform (Buyer buyer, Map<Product, Integer> products) {
        System.out.println("You made an order");
        System.out.println("You ordered: \n" + products + "\n");
        System.out.println(buyer);

    }
}
