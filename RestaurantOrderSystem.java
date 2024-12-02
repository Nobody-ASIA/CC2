import java.util.Scanner;

public class RestaurantOrderSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menuChoice, quantity;
        double totalAmount = 0.0;

        while (true) {
            // Display the menu
            System.out.println("MENU");
            System.out.println("1. Burger    - PHP 100");
            System.out.println("2. Fries     - PHP  50");
            System.out.println("3. Soda      - PHP  30");
            System.out.println("4. Ice Cream - PHP  45");
            System.out.println("5. Exit");

            // Prompt the user to enter the menu number
            System.out.print("Enter the menu number of your choice: ");
            menuChoice = scanner.nextInt();

            if (menuChoice == 5) {
                // Exit the loop if the user chooses to exit
                break;
            }

            if (menuChoice >= 1 && menuChoice <= 4) {
                // Prompt the user to enter the quantity
                System.out.print("Enter the quantity: ");
                quantity = scanner.nextInt();

                // Calculate the total amount for the selected item
                switch (menuChoice) {
                    case 1:
                        totalAmount += 100 * quantity;
                        break;
                    case 2:
                        totalAmount += 50 * quantity;
                        break;
                    case 3:
                        totalAmount += 30 * quantity;
                        break;
                    case 4:
                        totalAmount += 45 * quantity;
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        // Display the final total bill
        System.out.println("Total amount: " + totalAmount + " PHP");

        scanner.close();
    }
}
