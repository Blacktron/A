package com.accenture;

public class StampMachine {
    private static final double FIRST_CLASS_STAMP_PRICE = 0.44;
    private double balance;

    public StampMachine() {
        balance = 0;
    }

    public void insert(int dollars) {
        balance += dollars;
    }

    public int giveFirstClassStamps() {
        int firstClassStamps = (int) (balance / FIRST_CLASS_STAMP_PRICE);
        balance -= firstClassStamps * FIRST_CLASS_STAMP_PRICE;

        return firstClassStamps;
    }

    public int givePennyStamps() {
        int pennyStamps = (int) (balance * 100);
        balance = 0;

        return pennyStamps;
    }
}
