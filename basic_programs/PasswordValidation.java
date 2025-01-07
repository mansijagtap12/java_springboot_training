import java.util.Scanner;

public class PasswordValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input password from user
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        // Check if password is valid
        if (isValidPassword(password)) {
            System.out.println("Password is valid.");
        } else {
            System.out.println("Password is invalid. It must be at least 8 characters long and contain both letters and numbers.");
        }

        scanner.close();
    }

    // Method to check if password is valid
    public static boolean isValidPassword(String password) {
        // Check if the password is at least 8 characters long
        if (password.length() < 8) {
            return false;
        }

        // Check if the password contains both letters and numbers
        boolean hasLetter = false;
        boolean hasDigit = false;

        for (int i = 0; i < password.length(); i++) {
            if (Character.isLetter(password.charAt(i))) {
                hasLetter = true;
            }
            if (Character.isDigit(password.charAt(i))) {
                hasDigit = true;
            }
        }

        // Return true if both conditions are satisfied
        return hasLetter && hasDigit;
    }
}
