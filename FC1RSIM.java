import java.util.Scanner;

public class FC1RSIM {
    public static void main(String[] args) {
        //quantities for 10 products
        int[] stockLevels = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10};

        //store prices for the corresponding 10 products
        double[] prices = {500.0, 400.0, 300.0, 200.0, 100.0, 90.0, 80.0, 70.0, 60.0, 50.0};

        Scanner scanner = new Scanner(System.in);

        // Display product options for the user
        System.out.println("Available products:");
        for (int i = 0; i < stockLevels.length; i++) {
            System.out.printf("Product %d - Price: $%.2f, Stock: %d%n", i + 1, prices[i], stockLevels[i]);
        }

        // Ask user to choose a product
        System.out.print("\nEnter the product number (1-10) you want to buy: ");
        int productIndex = scanner.nextInt() - 1;

        // Validate product choice
        if (productIndex < 0 || productIndex >= stockLevels.length) {
            System.out.println("Invalid product number.");
            return;
        }

        // Ask user to enter the quantity they want to buy
        System.out.print("Enter the quantity you want to buy: ");
        int quantity = scanner.nextInt();

        // Validate if enough stock is available
        if (quantity > stockLevels[productIndex]) {
            System.out.println("Sorry, not enough stock available.");
        } else {
            // Update stock level for the selected product
            stockLevels[productIndex] -= quantity;

            // Calculate the cost for the user's purchase
            double purchaseCost = quantity * prices[productIndex];
            System.out.printf("You bought %d units of Product %d at $%.2f each. Total cost: $%.2f%n%n",
                    quantity, productIndex + 1, prices[productIndex], purchaseCost);
        }

        // Calculate the total value of remaining stock
        double totalStockValue = 0;
        for (int i = 0; i < stockLevels.length; i++) {
            totalStockValue += stockLevels[i] * prices[i];
        }

        // Display updated stock levels
        System.out.println("Updated stock levels:");
        for (int i = 0; i < stockLevels.length; i++) {
            System.out.printf("Product %d - Price: $%.2f, Stock: %d%n", i + 1, prices[i], stockLevels[i]);
        }

        // Display the total value of all items in stock
        System.out.printf("\nThe total value of all items in stock is: $%.2f%n", totalStockValue);

        scanner.close();
    }
}