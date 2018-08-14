import com.accenture.CashRegister;
import com.accenture.IceCreamCone;

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
        IceCreamCone cone = new IceCreamCone(10, 5);
        System.out.println("Surface = " + cone.getSurface());
        System.out.println("Volume = " + cone.getVolume());
    }
}
