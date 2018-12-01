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
        //double meters;
        //System.out.println("Enter meters:");
        //Scanner in = new Scanner(System.in);
        //meters = in.nextDouble();
        //Converter converter = new Converter(meters);
        //System.out.println(meters + " meters are " + converter.convertToMiles() + " miles");
        //System.out.println(meters + " meters are " + converter.convertToFeet() + " feet");
        //System.out.println(meters + " meters are " + converter.convertToInches() + " inches");

        // Task 4.8
        //Square square = new Square(15);
        //System.out.println("Perimeter = " + square.getPerimeter());
        //System.out.println("Area = " + square.getArea());
        //System.out.println("Diagonal length = " + square.getDiagonalLength());

        // Task 4.9
        //SodaCan sodaCan = new SodaCan(10, 5);
        //System.out.println("Volume = " + sodaCan.getVolume());
        //System.out.println("Surface area = " + sodaCan.getSurfaceArea());

        // Task 4.10
        //Balloon balloon = new Balloon();
        //balloon.addAir(100);
        //System.out.println("Volume = " + balloon.getVolume());
        //System.out.println("Surface area = " + balloon.getSurfaceArea());
        //System.out.println("Radius = " + balloon.getRadius());
        //balloon.addAir(100);
        //System.out.println("Volume = " + balloon.getVolume());
        //System.out.println("Surface area = " + balloon.getSurfaceArea());
        //System.out.println("Radius = " + balloon.getRadius());

        // Task 4.11
        //CashRegister register = new CashRegister();
        //register.recordPurchase(8.37);
        //register.enterPayment(10, 0, 0, 0, 0);
        //System.out.println("Dollars: " + register.giveDollars());
        //System.out.println("Expected: 1");
        //System.out.println("Quarters: " + register.giveQuarters());
        //System.out.println("Expected: 2");
        //System.out.println("Dimes: " + register.giveDimes());
        //System.out.println("Expected: 1");
        //System.out.println("Nickels: " + register.giveNickels());
        //System.out.println("Expected: 0");
        //System.out.println("Pennies: " + register.givePennies());
        //System.out.println("Expected: 3");

        // Task 4.12
        //StampMachine machine = new StampMachine();
        //machine.insert(1);
        //System.out.print("First class stamps: ");
        //System.out.println(machine.giveFirstClassStamps());
        //System.out.println("Expected: 2");
        //System.out.print("Penny stamps: ");
        //System.out.println(machine.givePennyStamps());
        //System.out.println("Expected: 12");

        // Task 4.13
        //Scanner in = new Scanner(System.in);
        //int numbers = in.nextInt();
        //DigitExtractor digitExtractor = new DigitExtractor(numbers);
        //System.out.println(digitExtractor.nextDigit());
        //System.out.println(digitExtractor.nextDigit());
        //System.out.println(digitExtractor.nextDigit());
        //System.out.println(digitExtractor.nextDigit());
        //System.out.println(digitExtractor.nextDigit());

        // Task 4.14
        //QuadraticEquation quadraticEquation = new QuadraticEquation(1, 3, -4);
        //System.out.println("Solution A = " + quadraticEquation.getSolutionA());
        //System.out.println("Solution B = " + quadraticEquation.getSolutionB());

        // Task 4.15
        //Scanner in = new Scanner(System.in);
        //System.out.print("Please enter the first time: ");
        //int first = in.nextInt();
        //System.out.print("Please enter the second time: ");
        //int second = in.nextInt();

        //TimeInterval interval = new TimeInterval(first, second);
        //System.out.print("Difference: " + interval.getHours() + " hours " + interval.getMinutes() + " minutes");

        // Task 4.18
        //Month month = new Month(6);
        //System.out.println("Month name: " + month.getName());

        // Task 4.19
        Easter easter = new Easter();
        System.out.println("Easter day = " + easter.getEasterSundayDay(2001));
        System.out.println("Easter month = " + easter.getEasterSundayMonth(2001));
    }
}
