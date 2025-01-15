import java.util.Scanner;

public class RestaurantMenuOrdering {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Restaurant Menu
        String[] menuItems = {"Pizza", "Burger", "Pasta", "Salad", "Soda"};
        double[] menuPrices = {8.99, 6.49, 7.99, 5.49, 1.99};

        // Display the menu
        System.out.println("Welcome to the Restaurant!");
        System.out.println("Here is the menu:");
        for (int i = 0; i < menuItems.length; i++) {
            System.out.printf("%d. %s - $%.2f\n", i + 1, menuItems[i], menuPrices[i]);
        }

        // Order variables
        double totalCost = 0.0;
        StringBuilder orderSummary = new StringBuilder("Your order:\n");

        boolean ordering = true;
        while (ordering) {
            // Take user input for menu selection
            System.out.print("\nEnter the menu item number to order (1-" + menuItems.length + "): ");
            int choice = scanner.nextInt();

            // Validate the choice
            if (choice >= 1 && choice <= menuItems.length) {
                int menuIndex = choice - 1;
                String selectedItem = menuItems[menuIndex];
                double selectedPrice = menuPrices[menuIndex];

                // Add item to order summary and update total cost
                orderSummary.append(String.format("- %s ($%.2f)\n", selectedItem, selectedPrice));
                totalCost += selectedPrice;

                System.out.printf("Added %s to your order. Current total: $%.2f\n", selectedItem, totalCost);
            } else {
                System.out.println("Invalid choice. Please select a valid menu item number.");
            }

            // Ask if the user wants to continue ordering
            System.out.print("Do you want to add more items? (yes/no): ");
            String response = scanner.next();
            ordering = response.equalsIgnoreCase("yes");
        }

        // Display the complete order and total cost
        System.out.println("\n" + orderSummary);
        System.out.printf("Total cost of your order: $%.2f\n", totalCost);

        scanner.close();
    }
}
