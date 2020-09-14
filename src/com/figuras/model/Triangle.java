package com.figuras.model;
// Triangle class
public class Triangle {
    // Triangle base
    private int base;
    // Triangle height
    private int height;
    // Triangle constructor
    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }
    // Area getter
    public double getArea() {
        return ((base*height)/2);
    }
    // Figure printing
    public void draw() {
        System.out.println("Triángulo");
    }
}
