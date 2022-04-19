package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.*;

public class Continent {

    List<Country> continent = new ArrayList<>();


    public List<Country> getContinent() {
        return continent;
    }
    void addCountry(Country country){

        continent.add(country);
    }
}







