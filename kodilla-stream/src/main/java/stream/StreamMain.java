package com.kodilla.stream;                                                   // [1]

import com.kodilla.stream.lambda.ExpressionExecutor;
import stream.beautifier.PoemBeautifier;


public class StreamMain {                                                     // [3]

    public static void main(String[] args) {                                   // [4]
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();       // [5]

        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);           // [6]
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);           // [7]
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);           // [8]
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);   // [9]

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3,4,  com.kodilla.stream.reference.FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, com.kodilla.stream.reference.FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, com.kodilla.stream.reference.FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, com.kodilla.stream.reference.FunctionalCalculator::divideAByB);

        PoemBeautifier poemBeautifier = new PoemBeautifier();



        poemBeautifier.beautify(" Poem ",s -> "ABC"+s+"ABC");
        poemBeautifier.beautify(" Poem ",s->s.toLowerCase());
        poemBeautifier.beautify(" Poem ", s->s.toUpperCase());
        poemBeautifier.beautify(" Poem ", s->s.trim());

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        com.kodilla.stream.iterate.NumbersGenerator.generateEven(20);
    }


}

