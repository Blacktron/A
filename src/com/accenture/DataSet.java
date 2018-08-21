package com.accenture;

public class DataSet {
    private int sum;
    private int average;
    private int counter;

    /**
     * Constructs a DataSet and initializes the object.
     */
    public DataSet() {
        this.sum = 0;
        this.average = 0;
        this.counter = 0;
    }

    /**
     * Adds a value to the sum.
     * @param value the value to be added.
     */
    public void addValue(int value) {
        sum = sum + value;
        counter++;
    }

    /**
     * Gets the sum of all entered values.
     * @return the sum of all values
     */
    public int getSum() {
        return sum;
    }

    /**
     * Gets the average of all entered values.
     * @return the average of all values
     */
    public int getAverage() {
        average = sum / counter;
        return average;
    }
}
