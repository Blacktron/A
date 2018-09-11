package com.accenture;

public class DigitExtractor {
    private int number;
    private int index;
    /**
     * Constructs a digit extractor that gets the digits
     * of an integer in reverse order.
     * @param anInteger the integer to break up into digits
     */
    public DigitExtractor(int anInteger) {
        this.number = anInteger;
        this.index = 0;
    }

    /**
     * Returns the next digit to be extracted.
     * @return the next digit
     */
    public int nextDigit() {
        String numbers = String.valueOf(number);
        int digit;

        if (index < numbers.length()) {

        }

        return digit;
    }
}
