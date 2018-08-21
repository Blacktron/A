package com.accenture;

public class Converter {
    private double meters;

    /**
     * Constructs a converter that can convert between two units.
     * @param meters the meters measurement to be converted
     */
    public Converter(double meters) {
        this.meters = meters;
    }

    /**
     * Converts meters to miles.
     * @return the result of the conversion
     */
    public double convertToMiles() {
        return meters * 0.000621371;
    }

    /**
     * Converts meters to feet.
     * @return the result of the conversion
     */
    public double convertToFeet() {
        return meters * 3.28084;
    }

    /**
     * Converts meters to inches.
     * @return the result of the conversion
     */
    public double convertToInches() {
        return meters * 39.3701;
    }
}
