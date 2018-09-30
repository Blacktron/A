package com.accenture;

public class DigitExtractor {
    private String number;
    private int index;
    /**
     * Constructs a digit extractor that gets the digits
     * of an integer in reverse order.
     * @param anInteger the integer to break up into digits
     */
    public DigitExtractor(int anInteger) {
        this.number = reverseString(anInteger);
        this.index = 0;
    }

    /**
     * Reverses a string.
     * @param anInteger the number which has to be reversed
     * @return reversed string
     */
    private String reverseString(int anInteger) {
        String numbers = String.valueOf(anInteger);
        char[] strArr = numbers.toCharArray();
        String result = "";

        for (int i = strArr.length - 1; i >= 0; i--) {
            result = result.concat(String.valueOf(strArr[i]));
        }

        return result;
    }

    /**
     * Returns the next digit to be extracted.
     * @return the next digit
     */
    public String nextDigit() {
        String digit = null;

        if (index < number.length()) {
            digit = number.substring(index, index + 1);
            index++;
        }

        return digit;
    }
}