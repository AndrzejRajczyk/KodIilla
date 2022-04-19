package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {
    String country;
    BigDecimal countryPopulation;

    public Country(String country, BigDecimal countryPopulation) {
        this.country = country;
        this.countryPopulation = countryPopulation;
    }

    public BigDecimal getCountryPopulation() {
        return countryPopulation;
    }

    public String getCountry() {
        return country;
    }

    BigDecimal getPeopleQuantity() {
        return countryPopulation;
    }
}
