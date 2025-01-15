import java.util.ArrayList;
import java.util.Scanner;

// Product Class
class Product {
    private String name;
    private double price;
    private int quantity;

    // Constructor
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Update quantity
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Display product details
    public void displayProduct() {
        System.out.printf("%-20s $%-10.2f %d\n", name, price, quantity);
    }
}

// Cart Class
class Cart {
    private ArrayList<Product> products;

    // Constructor
    public Cart() {
        products = new ArrayList<>();
    }

    // Add a product to the cart
    public void addProduct(Product product) {
        for (Product p : products) {
            if (p.getName().equalsIgnoreCase(product.getName())) {
                p.setQuantity(p.getQuantity() + product.getQuantity());
                return;
            }
        }
        products.add(product);
    }

    // Remove a product from the cart
    public void removeProduct(String productName) {
        products.removeIf(p -> p.getName().equalsIgnoreCase(productName));
    }

    // Calculate the total price of the cart
    public double calculateTotalPrice() {
        double total = 0;
        for (Product p : products) {
            total += p.getPrice() * p.getQuantity();
        }
        return total;
    }

    // Display the cart
    public void displayCart() {
        if (products.isEmpty()) {
            System.out.println("Your cart is empty.");
            return;
        }
        System.out.println("Cart Contents:");
        System.out.printf("%-20s %-10s %s\n", "Product Name", "Price", "Quantity");
        for (Product p : products) {
            p.displayProduct();
        }
        System.out.printf("\nTotal Price: $%.2f\n", calculateTotalPrice());
    }
}

// Main Class
public class ShoppingCartSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cart cart = new Cart();

        while (true) {
            System.out.println("\nShopping Cart System:");
            System.out.println("1. Add Product to Cart");
            System.out.println("2. Remove Product from Cart");
            System.out.println("3. View Cart");
            System.out.println("4. Checkout and Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (choice) {
                case 1:
                    System.out.print("Enter product name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter product price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter product quantity: ");
                    int quantity = scanner.nextInt();
                    cart.addProduct(new Product(name, price, quantity));
                    System.out.println("Product added to cart!");
                    break;

                case 2:
                    System.out.print("Enter the name of the product to remove: ");
                    String productName = scanner.nextLine();
                    cart.removeProduct(productName);
                    System.out.println("Product removed from cart!");
                    break;

                case 3:
                    cart.displayCart();
                    break;

                case 4:
                    System.out.println("Final Cart:");
                    cart.displayCart();
                    System.out.println("Thank you for shopping! Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
