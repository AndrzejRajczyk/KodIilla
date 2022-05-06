package com.kodilla.good.patterns.challenges.allegro;

import java.util.Map;

public interface PurchaseService {
    boolean purchase(Buyer buyer, Map<Product, Integer> products);
}
