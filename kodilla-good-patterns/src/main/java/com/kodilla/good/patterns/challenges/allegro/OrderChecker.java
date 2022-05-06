package com.kodilla.good.patterns.challenges.allegro;
import java.util.Map;

public interface OrderChecker {

    void order (Buyer buyer, Map<Product, Integer> products);

}
