package com.figuras.model;
/// Rectangle class
public class Rectangle {
    // Rectangle base
    private int base;
    // Rectangle height
    private int height;
    // Rectangle constructor
    public Rectangle(int base, int height) {
        this.height = height;
        this.base = base;
    }
    // Area getter
    public double getArea(){
        return (base*height);
    }
    // Figure printing
    public void draw(){
        System.out.println("Rectangulo");
    }
}
