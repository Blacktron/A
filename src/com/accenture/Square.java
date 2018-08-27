package com.accenture;

public class Square {
    private double sideA;

    /**
     * Construct a Square object with given side.
     * @param sideA the side of the square
     */
    public Square(double sideA) {
        this.sideA = sideA;
    }

    /**
     * Calculates the perimeter of the Square.
     * @return the perimeter of the Square
     */
    public double getPerimeter() {
        return sideA * 4;
    }

    /**
     * Calculates the area of the Square.
     * @return the area of the Square
     */
    public double getArea() {
        return Math.pow(sideA, 2);
    }

    /**
     * Calculates the length of the diagonal.
     * @return the length of the diagonal
     */
    public double getDiagonalLength() {
        return Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideA, 2));
    }
}