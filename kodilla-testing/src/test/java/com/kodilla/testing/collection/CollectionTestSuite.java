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

    @DisplayName("When listis empty, new empty list should be returned and printed: no data")

    @Test
    void testOddNumbersExterminatorNormaList() {
        // Given
        Integer int0 = 0;
        Integer int1 = 1;
        Integer int2 = 2;
        Integer int3 = 3;
        Integer int4 = 4;
        Integer int5 = 5;

        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(int0);
        numbers.add(int1);
        numbers.add(int2);
        numbers.add(int3);
        numbers.add(int4);
        numbers.add(int5);

        List<Integer> expectedResult = new ArrayList<Integer>();
        expectedResult.add(int0);
        expectedResult.add(int2);
        expectedResult.add(int4);
        List<Integer> result = new ArrayList<Integer>();


        //when
        OddNumbersExterminator oddNumbersexterminator = new OddNumbersExterminator(numbers);
        result = oddNumbersexterminator.exterminate();

        System.out.println("Testing data:" + numbers);
        System.out.println("Expexted Data: " + expectedResult);
        System.out.println("result" + result);

        //Then
        Assertions.assertEquals(expectedResult, result);
    }
    @Test
    void testOddNumbersExterminatorEmptyList() {

        // Given
        Integer int0 = 0;
        Integer int1 = 1;
        Integer int2 = 2;
        Integer int3 = 3;
        Integer int4 = 4;
        Integer int5 = 5;

        List<Integer> numbers = new ArrayList<Integer>();


        List<Integer> expectedResult = new ArrayList<Integer>();

        List<Integer> result = new ArrayList<Integer>();


        //when
        OddNumbersExterminator oddNumbersexterminator = new OddNumbersExterminator(numbers);
        result = oddNumbersexterminator.exterminate();

        System.out.println("Testing data:" + numbers);
        System.out.println("Expexted Data: " + expectedResult);
        System.out.println("result" + result);

        //Then
        Assertions.assertEquals(expectedResult, result);
    }
    }




