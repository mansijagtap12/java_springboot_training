import java.util.Scanner;

public class ProductStockChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize the products and their stock levels
        String[] products = {"Product A", "Product B", "Product C", "Product D"};
        int[] stock = {50, 10, 5, 20}; // Initial stock levels
        int threshold = 15; // Reorder threshold

        System.out.println("Warehouse Stock Management System");
        System.out.println("===================================");

        boolean continueChecking = true;

        while (continueChecking) {
            System.out.println("\nCurrent Stock Levels:");
            displayStock(products, stock);

            System.out.println("\nProducts below the reorder threshold (" + threshold + "):");
            boolean needsReorder = false;

            for (int i = 0; i < products.length; i++) {
                if (stock[i] < threshold) {
                    System.out.println("- " + products[i] + " (Stock: " + stock[i] + ")");
                    needsReorder = true;
                }
            }

            if (!needsReorder) {
                System.out.println("All products have sufficient stock.");
            }

            // Ask the user if they want to update stock levels
            System.out.print("\nDo you want to update stock levels? (yes/no): ");
            String response = scanner.next().toLowerCase();

            if (response.equals("yes")) {
                System.out.println("\nEnter updated stock levels:");
                for (int i = 0; i < products.length; i++) {
                    System.out.print(products[i] + " (Current stock: " + stock[i] + "): ");
                    stock[i] = scanner.nextInt();
                }
            } else {
                continueChecking = false;
            }
        }

        System.out.println("\nFinal Stock Levels:");
        displayStock(products, stock);
        System.out.println("Thank you for using the Product Stock Checker!");
        scanner.close();
    }

    // Method to display the current stock levels
    public static void displayStock(String[] products, int[] stock) {
        System.out.println("Product\t\tStock");
        System.out.println("------------------------");
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i] + "\t\t" + stock[i]);
        }
    }
}
