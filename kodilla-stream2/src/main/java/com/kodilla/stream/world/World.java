package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;




public final class World {


    final List<Continent> continentsWorld = new ArrayList<>();

    void addContinent(Continent continent){
        continentsWorld.add(continent);
    }


    public  BigDecimal getPeopleQuantity() {
      BigDecimal worldPeopleQuantity = continentsWorld.stream()
               .flatMap(continent ->continent.getContinent().stream())
               .map(country -> country.getPeopleQuantity())
               .reduce(BigDecimal.ZERO, (countryPopulation, current) -> countryPopulation = countryPopulation.add(current));

        return worldPeopleQuantity;

    }


}

