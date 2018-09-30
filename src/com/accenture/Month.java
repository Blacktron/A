package com.accenture;

public class Month {
    private int month;

    /**
     * Constructs an object ot type Month
     * @param month the desired month
     */
    public Month(int month) {
        this.month = month - 1;
    }

    /**
     * Gets the name of the month based on the provided number.
     * @return the name of the month
     */
    public String getName() {
        String MONTHS = "January  February March    April    May      June     July     August   SeptemberOctober  November December ";
        return MONTHS.substring(month * 9, month * 9 + 9);
    }
}