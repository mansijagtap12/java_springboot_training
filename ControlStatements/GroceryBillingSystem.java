import java.util.Scanner;

public class GroceryBillingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of customers
        System.out.print("Enter the number of customers: ");
        int numCustomers = scanner.nextInt();

        // Loop through each customer
        for (int customer = 1; customer <= numCustomers; customer++) {
            System.out.println("\nProcessing Customer " + customer + ":");

            double totalBill = 0; // Initialize total bill for the customer
            boolean isDone = false;

            // Loop to process items for the current customer
            while (!isDone) {
                // Input item details
                System.out.print("Enter item name: ");
                String itemName = scanner.next();
                System.out.print("Enter item price: ");
                double itemPrice = scanner.nextDouble();
                System.out.print("Enter item quantity: ");
                int itemQuantity = scanner.nextInt();

                // Calculate total price for the item and add it to the bill
                double itemTotal = itemPrice * itemQuantity;
                totalBill += itemTotal;

                System.out.printf("Added %s (Quantity: %d) - $%.2f\n", itemName, itemQuantity, itemTotal);

                // Ask if the customer is done adding items
                System.out.print("Do you want to add more items? (yes/no): ");
                String response = scanner.next();
                isDone = response.equalsIgnoreCase("no");
            }

            // Display the total bill for the customer
            System.out.printf("Total bill for Customer %d: $%.2f\n", customer, totalBill);
        }

        scanner.close();
    }
}
