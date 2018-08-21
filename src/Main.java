import com.accenture.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Task 4.1
        //CashRegister register = new CashRegister();
        //register.recordPurchase(20.37);
        //register.enterDollars(20);
        //register.enterQuarters(2);
        //System.out.println("Change: " + register.giveChange());
        //System.out.println("Expected: 0.13");

        // Task 4.2
        //CashRegister register = new CashRegister();
        //register.recordPurchase(20.37);
        //register.enterDollars(20);
        //register.enterQuarters(2);
        //System.out.println("Item count: " + register.getItemCount());
        //System.out.println("Change: " + register.giveChange());
        //System.out.println("Expected: 0.13");

        // Task 4.3
        //IceCreamCone cone = new IceCreamCone(10, 5);
        //System.out.println("Surface = " + cone.getSurface());
        //System.out.println("Volume = " + cone.getVolume());

        // Task 4.4
        //Scanner in = new Scanner(System.in);
        //double first = in.nextDouble();
        //double second = in.nextDouble();
        //Pair myPair = new Pair(first, second);
        //System.out.println("Sum = " + myPair.getSum());
        //System.out.println("Difference = " + myPair.getDifference());
        //System.out.println("Product = " + myPair.getProduct());
        //System.out.println("Average = " + myPair.getAverage());
        //System.out.println("Distance = " + myPair.getDistance());
        //System.out.println("Maximum = " + myPair.getMaximum());
        //System.out.println("Minimum = " + myPair.getMinimum());

        // Task 4.5
        //DataSet mySet = new DataSet();
        //mySet.addValue(2);
        //mySet.addValue(3);
        //mySet.addValue(4);
        //mySet.addValue(5);
        //System.out.println("Sum = " + mySet.getSum());
        //System.out.println("Expected sum is = 14");
        //System.out.println("Average = " + mySet.getAverage());
        //System.out.println("Expected average is = 3");

        // Task 4.6
        //DataSetV2 mySet = new DataSetV2();
        //mySet.addValue(4);
        //mySet.addValue(10);
        //mySet.addValue(1);
        //mySet.addValue(15);
        //System.out.println("Minimum = " + mySet.getMinimum());
        //System.out.println("Expected minimum = 1");
        //System.out.println("Maximum = " + mySet.getMaximum());
        //System.out.println("Expected maximum = 15");

        // Task 4.7
        double meters;
        System.out.println("Enter meters:");
        Scanner in = new Scanner(System.in);
        meters = in.nextDouble();
        Converter converter = new Converter(meters);
        System.out.println(meters + " meters are " + converter.convertToMiles() + " miles");
        System.out.println(meters + " meters are " + converter.convertToFeet() + " feet");
        System.out.println(meters + " meters are " + converter.convertToInches() + " inches");
    }
}
