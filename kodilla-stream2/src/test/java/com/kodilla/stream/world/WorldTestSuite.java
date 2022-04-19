package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        World world = new World();
        Continent continent = new Continent();
        Country poland = new Country("Poland",new BigDecimal("35000000"));
        Country germany = new Country("Germany", new BigDecimal("80000000"));

        continent.addCountry(poland);
        continent.addCountry(germany);
        world.addContinent(continent);

        //When
        BigDecimal resuolt  = world.getPeopleQuantity();


        //Then

        Assertions.assertEquals(new BigDecimal(115000000), resuolt);
    }

}
