package com.kodilla.patterns.prototype;

public class Prototypelib<T> implements Cloneable {

    @Override
    public T clone() throws CloneNotSupportedException {
        return (T)super.clone();
    }
}