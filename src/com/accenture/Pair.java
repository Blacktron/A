package com.accenture;

public class Pair {
    private double aFirst;
    private double aSecond;

    /**
     * Constructs a pair.
     * @param aFirst the first value of the pair
     * @param aSecond the secont value of the pair
     */
    public Pair(double aFirst, double aSecond) {
        this.aFirst = aFirst;
        this.aSecond = aSecond;
    }

    /**
     * Calculates the sum of two numbers.
     * @return the sum of two numbers
     */
    public double getSum() {
        return aFirst + aSecond;
    }

    /**
     * Calculates the difference between two numbers.
     * @return the difference between two numbers
     */
    public double getDifference() {
        return aFirst - aSecond;
    }

    /**
     * Calculates the product of two numbers.
     * @return the product of two numbers
     */
    public double getProduct() {
        return aFirst * aSecond;
    }

    /**
     * Calculates the average of two numbers.
     * @return the average of two numbers
     */
    public double getAverage() {
        return (aFirst + aSecond) / 2;
    }

    /**
     * Calculates the distance between two numbers.
     * @return the distance between two numbers
     */
    public double getDistance() {
        return Math.abs(getDifference());
    }

    /**
     * Gets the maximum between two numbers.
     * @return the maximum between two numbers
     */
    public double getMaximum() {
        if (aFirst > aSecond) {
            return aFirst;
        } else {
            return aSecond;
        }
    }

    /**
     * Gets the minimum between two numbers.
     * @return the maximum between two numbers
     */
    public double getMinimum() {
        if (aFirst < aSecond) {
            return aFirst;
        } else {
            return aSecond;
        }
    }
}
