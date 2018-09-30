package com.accenture;

public class TimeInterval {
    String firstTime;
    String secondTime;
    int timeA;
    int timeB;

    public TimeInterval(String firstTime, String secondTime) {
        //this.timeA = convertTimeToInt(timeA);
        //this.timeB = convertTimeToInt(timeB);
        this.firstTime = firstTime;
        this.secondTime = secondTime;
    }

    private int convertHoursToInt(String time) {
        String hoursToConvert;

        if (time.substring(0, 1).equals("0")) {
            hoursToConvert = time.substring(1, 2);
        } else {
            hoursToConvert = time.substring(0, 2);
        }

        return Integer.parseInt(hoursToConvert);
    }

    public int getHours() {
        int hoursA = convertHoursToInt(firstTime);
        int hoursB = convertHoursToInt(secondTime);
        int hours = Math.abs(hoursA - hoursB);
        System.out.println(hours);

        return hours;
    }
}