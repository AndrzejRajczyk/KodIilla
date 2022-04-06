package com.kodilla.testing.shape;



public class Circle implements Shape {
    String name;
    int field;

    public Circle(String name, int field) {
        this.name = name;
        this.field = field;
    }

    public String getName () {
        return name;
    }

    public int getField() {
        return field;
    }
}



