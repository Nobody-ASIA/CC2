import java.util.Scanner;

public class PasswordValidator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean validPassword = false;

        while (!validPassword) {
            System.out.print("Enter your password: ");
            String password = scanner.nextLine();

            // Check if password is at least 8 characters long
            if (password.length() < 8) {
                System.out.println("Password must be at least 8 characters long.");
                continue;
            }

            // Check if password contains at least one uppercase letter
            boolean hasUppercase = false;
            for (int i = 0; i < password.length(); i++) {
                char c = password.charAt(i);
                if (Character.isUpperCase(c)) {
                    hasUppercase = true;
                    break;
                }
            }
            if (!hasUppercase) {
                System.out.println("Password must contain at least one uppercase letter.");
                continue;
            }

            // Check if password contains at least one number
            boolean hasNumber = false;
            for (int i = 0; i < password.length(); i++) {
                char c = password.charAt(i);
                if (Character.isDigit(c)) {
                    hasNumber = true;
                    break;
                }
            }
            if (!hasNumber) {
                System.out.println("Password must contain at least one number.");
                continue;
            }

            // If all conditions are met
            System.out.println("Your password is valid!");
            validPassword = true;
        }

        scanner.close();
    }
}
