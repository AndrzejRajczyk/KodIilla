package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {


    @Test
    void testGetAverage() {



        //Given
        int[] array = new int[20];
        for (int i = 0; i <= 19; i++) {
            array[i] = i;
        }

        double average =  ArrayOperations.getAverage(array);

        assertEquals(9.5, average, 0.01);
    }
}