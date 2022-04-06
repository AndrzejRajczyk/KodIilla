package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @DisplayName("When lists empty, new empty list should be returned and printed: no data")

    @Test
    void testOddNumbersExterminatorNormaList() {
        // Given


        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(0);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(1);

        List<Integer> expectedResult = new ArrayList<Integer>();
        expectedResult.add(0);
        expectedResult.add(2);
        expectedResult.add(4);


        //when
        OddNumbersExterminator oddNumbersexterminator = new OddNumbersExterminator();
        List<Integer> result = oddNumbersexterminator.exterminate(numbers);


        System.out.println("Testing data:" + numbers);
        System.out.println("Expexted Data: " + expectedResult);
        System.out.println("result" + result);

        //Then
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void testOddNumbersExterminatorEmptyList() {

        // Given


        List<Integer> numbers = new ArrayList<Integer>();


        List<Integer> expectedResult = new ArrayList<Integer>();


        List<Integer> result = new ArrayList<Integer>();


        //when
        OddNumbersExterminator oddNumbersexterminator = new OddNumbersExterminator();
        result = oddNumbersexterminator.exterminate(numbers);

        System.out.println("Testing data:" + numbers);
        System.out.println("Expexted Data: " + expectedResult);
        System.out.println("result" + result);

        //Then
        Assertions.assertEquals(expectedResult, result);
    }
}




