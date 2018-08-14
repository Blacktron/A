package com.accenture;

public class IceCreamCone {
    private static double PI = 3.14;
    private double height;
    private double radius;

    /**
     * Constructs a cone with height and radius.
     * @param height the height of the cone
     * @param radius the radius of the cone
     */
    public IceCreamCone(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    /**
     * Calculates the surface of the cone.
     * @return the surface of the cone
     */
    public double getSurface() {
        return PI * radius * (radius + Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2)));
    }

    /**
     * Calculates the volume of the cone.
     * @return the volume of the cone
     */
    public double getVolume() {
        return PI * Math.pow(radius, 2) * (height / 3);
    }
}
