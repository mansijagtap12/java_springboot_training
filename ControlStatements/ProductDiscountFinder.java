import java.util.Scanner;

public class ProductDiscountFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Product Discount Finder");
        System.out.println("========================");

        // Get the number of products
        System.out.print("Enter the number of products: ");
        int numProducts = scanner.nextInt();

        // Arrays to store product prices and discount percentages
        double[] prices = new double[numProducts];
        double[] discounts = new double[numProducts];
        double[] discountedPrices = new double[numProducts];

        // Loop to input prices and discounts for each product
        for (int i = 0; i < numProducts; i++) {
            System.out.print("\nEnter the price of product " + (i + 1) + ": ");
            prices[i] = scanner.nextDouble();

            System.out.print("Enter the discount percentage for product " + (i + 1) + ": ");
            discounts[i] = scanner.nextDouble();

            // Calculate discounted price
            discountedPrices[i] = prices[i] - (prices[i] * (discounts[i] / 100));
        }

        // Display discounted prices
        System.out.println("\nDiscounted Prices:");
        System.out.println("===================");
        for (int i = 0; i < numProducts; i++) {
            System.out.printf("Product %d: Original Price = $%.2f, Discount = %.2f%%, Discounted Price = $%.2f%n",
                    (i + 1), prices[i], discounts[i], discountedPrices[i]);
        }

        scanner.close();
    }
}
