package com.kodilla.good.patterns.challenges.food;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Order {
   private Map<Supplier, Purchase> fullorder = new HashMap() ;

    void add (Supplier supplier, Purchase purchase){
        fullorder.put(supplier , purchase);
    }

    public Map<Supplier,Purchase> getFullorder() {
        return fullorder;
    }
}
