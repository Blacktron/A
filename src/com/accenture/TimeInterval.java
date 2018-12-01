package com.accenture;

public class TimeInterval {

    private final int firstTime;
    private final int secondTime;
    public final int HOURS_IN_DAY = 24;

    /**
     * Constructs a time interval.
     *
     * @param firstTime the first time in military time
     * @param secondTime the second time in military time
     */
    public TimeInterval(int firstTime, int secondTime) {
        this.firstTime = firstTime;
        this.secondTime = secondTime;
    }

    /**
     * Returns the hours of the time difference.
     *
     * @return the hours
     */
    public int getHours() {
        int hours;
        if (firstTime > secondTime) {

            int firstHour = firstTime / 100;
            int secondHour = secondTime / 100;
            hours = ((secondHour - firstHour + HOURS_IN_DAY ) % HOURS_IN_DAY);
        } else {
            hours = (secondTime - firstTime) / 100;
        }
        return hours;
    }

    /**
     * Returns the minutes of the time difference.
     *
     * @return the minutes
     */
    public int getMinutes() {
        int minutes = 0;
        int firstTimeMinutes = firstTime % 100;
        int secondTimeMinutes = secondTime % 100;
        if (firstTime > secondTime) {
            minutes = (firstTimeMinutes - secondTimeMinutes);
        } else {
            minutes = Math.abs(secondTimeMinutes - firstTimeMinutes);
        }
        return minutes;
    }
}