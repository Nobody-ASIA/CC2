import java.util.Scanner;

/* SALDUA, GIO BRIX R.                         24/09/2024
   CC2-1B                     Grocery Shopping Calculator                
*/

public class ShoppingCalculator {
    public static void main(String[] args) {

        // Input:
        Scanner scnr = new Scanner(System.in);
        double p1, p2, p3;
        int q1, q2, q3;
        double Subtotal;
        double Discount;
        double Tax;
        double Total;

        System.out.println("Grocery Shopping Calculator");

        // Price and quantity for item 1
        System.out.print("Enter the price of item 1     : ");
        p1 = scnr.nextDouble();
        System.out.print("Enter the quantity of item 1  : ");
        q1 = scnr.nextInt();

        // Price and quantity for item 2
        System.out.print("Enter the price of item 2     : ");
        p2 = scnr.nextDouble();
        System.out.print("Enter the quantity of item 2  : ");
        q2 = scnr.nextInt();

        // Price and quantity for item 3
        System.out.print("Enter the price of item 3     : ");
        p3 = scnr.nextDouble();
        System.out.print("Enter the quantity of item 3  : ");
        q3 = scnr.nextInt();

        // Calculation
        Subtotal = (p1 * q1) + (p2 * q2) + (p3 * q3);
        Discount = Subtotal * 0.05;
        Tax = (Subtotal - Discount) * 0.12;
        Total = (Subtotal - Discount) + Tax;

        // Output
        System.out.println("\n------- Receipt -------");
        System.out.println("Subtotal   : PHP " + Subtotal);
        System.out.println("Discount   : PHP " + Discount);
        System.out.println("Sales Tax  : PHP " + Tax);
        System.out.println("Total      : PHP " + Total);

        scnr.close();

    }
}
            


    
