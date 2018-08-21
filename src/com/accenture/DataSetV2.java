package com.accenture;

public class DataSetV2 {
    private int minimum;
    private int maximum;

    /**
     * Creates a DataSetV2 object.
     */
    public DataSetV2() {
        this.minimum = Integer.MAX_VALUE;
        this.maximum = Integer.MIN_VALUE;
    }

    /**
     * Adds a value to the data set.
     * @param value the value to be added.
     */
    public void addValue(int value) {
        minimum = Math.min(minimum, value);
        maximum = Math.max(maximum, value);
    }

    /**
     * Gets the smallest entered value.
     * @return the smallest value
     */
    public int getMinimum() {
        return minimum;
    }

    /**
     * Gets the largest entered value.
     * @return the largest value
     */
    public int getMaximum() {
        return maximum;
    }
}
