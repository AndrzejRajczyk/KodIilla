package com.kodilla.testing.shape;



public class Square implements Shape {
    String name;
    int field;

    public Square(String name, int field) {
        this.name = name;
        this.field = field;
        String figure="square";
    }

    public String getName () {
        return name;
    }

    public int getField() {
        return field;
    }
}
