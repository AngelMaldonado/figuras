package com.figuras.model;
// Circle class
public class Circle {
    // Circle radio
    private int radio;
    // Circle constructor
    public Circle(int radio) {
        this.radio = radio;
    }
    // Area getter
    public double getArea(){
        return (3.1416*(radio*radio));
    }
    // Figure printing
    public void draw(){
        System.out.println("Círculo");
    }

}
