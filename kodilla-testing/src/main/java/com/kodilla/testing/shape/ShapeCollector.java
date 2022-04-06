package com.kodilla.testing.shape;


import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    List<Shape> shapes = new ArrayList<>();

    void addFigure(Shape shape) {
        shapes.add(shape);


    }

    void removeFigure (Shape shape) {
        shapes.remove(shape);
    }

    Shape getFigure(int n) {
        if(n>=0 && n<shapes.size()) {
        return shapes.get(n);
        }
         return null;
    }

   String  showFigures() {
        System.out.println(shapes.toString());
        String s = shapes.toString();
        return s;
    }
}
