package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class BigmacTestSuite {
    @Test
    void BigmacBuilderTest(){
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .ingredient("onion")
                .ingredient("cheese")
                .ingredient("muschrooms")
                .sauce("hot")
                .burger(3)
                .bun("pure")
                .build();
        System.out.println(bigmac);

        // When
        int sizeIngredients = bigmac.getIngredients().size();
        int sizeBurgers = bigmac.getBurgers();
        // Then
        Assert.assertEquals(3, sizeIngredients);
        Assert.assertEquals(3, sizeBurgers);
    }
}
