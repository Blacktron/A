package com.accenture;

public class Balloon {
    private double volume;
    private static final double PI = 3.14;

    /**
     * Constructs an empty Balloon.
     */
    public Balloon() {
        volume = 0;
    }

    /**
     * Adds air in the balloon.
     * @param amount the amount of air to be added
     */
    public void addAir(double amount) {
        volume = volume + amount;
    }

    /**
     * Gets the volume of the balloon.
     * @return the current volume of the balloon
     */
    public double getVolume() {
        return volume;
    }

    /**
     * Gets the surface area of the balloon.
     * @return the surface area of the balloon
     */
    public double getSurfaceArea() {
        return 4 * PI * Math.pow(getRadius(), 2);
    }

    /**
     * Gets the radius of the balloon.
     * @return the radius of the balloon
     */
    public double getRadius() {
        return Math.pow((volume / PI) * (3.0 / 4.0), (1.0 / 3.0));
    }
}
