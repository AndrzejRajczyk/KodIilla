package com.kodilla.testing.calculator;

public class Calculator {
    int a;
    int b;


    public  Calculator (int a, int b){
        this.a=a;
        this.b=b;
    }
    public  int calculatorAdd(){
        return a+b;
    }

    public  int calculatorSubstract(){
        return a-b;
    }
    public int getA() {
        return a;
    }
    public int getB() {
        return b;
    }
}

