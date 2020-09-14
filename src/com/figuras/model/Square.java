package com.figuras.model;
/// Square class
public class Square {
    // Square sides
    private int side;
    // Square constructor
    public Square(int side) {
        this.side = side;
    }
    // Side getter
    public int getSide() {
        return side;
    }
    // Side setter
    public void setSide(int side) {
        this.side = side;
    }
    // Area getter
    public double getArea() {
        return (side*side);
    }
    // Figure printing
    public void draw() {
        System.out.println("Cuadrado");
    }
}
