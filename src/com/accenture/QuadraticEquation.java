package com.accenture;

public class QuadraticEquation {
    int a;
    int b;
    int c;

    /**
     * Constructs a QuatricEquation object
     * @param a an integer
     * @param b an integer
     * @param c an integer
     */
    public QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Calculates the first solution of the quadratic equation.
     * @return the result of the calculation
     */
    public double getSolutionA() {
        return (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
    }

    /**
     * Calculates the second solution of the quadratic equation.
     * @return the result of the calculation
     */
    public double getSolutionB() {
        return (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
    }
}
