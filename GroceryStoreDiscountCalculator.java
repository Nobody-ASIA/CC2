import java.util.Scanner;

public class GroceryStoreDiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total purchase amount (PHP): ");
        double totalAmount = scanner.nextDouble();

        double discount = 0.0;
        double finalPrice;

        if (totalAmount < 1000) {
            discount = 0.0;
        } else if (totalAmount <= 5000) {
            discount = 0.05;
        } else if (totalAmount <= 10000) {
            discount = 0.10;
        } else {
            discount = 0.15;
        }

        finalPrice = totalAmount - (totalAmount * discount);

        System.out.println("Discount applied: " + (int)(discount * 100) + "%");
        System.out.println("Final price after discount: PHP " + finalPrice);

        scanner.close();
    }
}