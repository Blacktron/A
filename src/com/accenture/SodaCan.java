package com.accenture;

public class SodaCan {
    private double height;
    private double radius;
    private static final double PI = 3.14;

    /**
     * Constructs a SodaCan object with given height and radius.
     * @param height the height of the SodaCan
     * @param radius the radius of the SodaCan
     */
    public SodaCan(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    /**
     * Calculates the volume of the SodaCan.
     * @return the volume of the SodaCan
     */
    public double getVolume() {
        return PI * Math.pow(radius, 2) * height;
    }

    /**
     * Calculates the surface area of the SodaCan.
     * @return the surface area of the SodaCan
     */
    public double getSurfaceArea() {
        return (2 * PI * radius * height) + (2 * PI * Math.pow(radius, 2));
    }
}