package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

class OddNumbersExterminator {


    public OddNumbersExterminator() {

    }

    public List<Integer> exterminate(List<Integer> numbers) {
        List<Integer> evenNumbers = new ArrayList<>();
        if (numbers.size() == 0) {
            System.out.println("No Data: ");
        }
        for (Integer i : numbers) {
            if (i % 2 == 0) {
                evenNumbers.add(i);
            }
        }

        return evenNumbers;

    }


}
