import com.accenture.CashRegister;
import com.accenture.IceCreamCone;
import com.accenture.Pair;

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
        Scanner in = new Scanner(System.in);
        double first = in.nextDouble();
        double second = in.nextDouble();
        Pair myPair = new Pair(first, second);
        System.out.println("Sum = " + myPair.getSum());
        System.out.println("Difference = " + myPair.getDifference());
        System.out.println("Product = " + myPair.getProduct());
        System.out.println("Average = " + myPair.getAverage());
        System.out.println("Distance = " + myPair.getDistance());
        System.out.println("Maximum = " + myPair.getMaximum());
        System.out.println("Minimum = " + myPair.getMinimum());
    }
}
