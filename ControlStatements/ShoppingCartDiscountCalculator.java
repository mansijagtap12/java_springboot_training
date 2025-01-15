import java.util.Scanner;

public class ShoppingCartDiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the total amount of items in the cart
        System.out.print("Enter the total amount of items in the cart: $");
        double totalAmount = scanner.nextDouble();

        // Variable to store the discount rate
        double discount = 0;

        // Apply discounts based on the total amount using if-else conditions
        if (totalAmount > 500) {
            discount = 0.10; // 10% discount for total > $500
        } else if (totalAmount >= 200 && totalAmount <= 500) {
            discount = 0.05; // 5% discount for total between $200 and $500
        } else {
            discount = 0; // No discount for total < $200
        }

        // Calculate the discount amount
        double discountAmount = totalAmount * discount;

        // Calculate the final price after discount
        double finalPrice = totalAmount - discountAmount;

        // Display the discount and final price
        System.out.println("Total Amount: $" + totalAmount);
        System.out.println("Discount Applied: $" + discountAmount);
        System.out.println("Final Price After Discount: $" + finalPrice);

        scanner.close();
    }
}
