package com.kodilla.testing.collection;
import java.util.ArrayList;
import java.util.List;
class OddNumbersExterminator {

    List<Integer> evenNumbers = new ArrayList<>();
    List<Integer> numbers = new ArrayList<>();

    public OddNumbersExterminator(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public List<Integer> exterminate() {
        for (int i = 0; i <= numbers.size() - 1; i++) {
            Integer temp = numbers.get(i);
            int number = numbers.get(i) % 2;
            if (number % 2 < 1) {
                evenNumbers.add(temp);
            }
        }


            return evenNumbers;

    }



    }
