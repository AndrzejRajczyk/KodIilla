package com.kodilla.stream.array;

import java.lang.reflect.Array;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

interface ArrayOperations {

   static double getAverage(int[] numbers){

        double average;
       double sum;

           average =  IntStream.range(0, numbers.length)
                    .map(n->n=numbers[n])
                    .average().orElse(0);
           return  average;

   }

}

