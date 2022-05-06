package com.kodilla.good.patterns.challenges.allegro;

import java.util.Map;

public interface InformationService {
    void inform (Buyer buyer, Map<Product, Integer> products);
}
