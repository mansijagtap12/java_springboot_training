import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// MenuItem class
class MenuItem {
    private String itemName;
    private double itemPrice;
    private String itemCategory;

    public MenuItem(String itemName, double itemPrice, String itemCategory) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemCategory = itemCategory;
    }

    public String getItemName() {
        return itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public String getItemCategory() {
        return itemCategory;
    }

    @Override
    public String toString() {
        return itemName + " (" + itemCategory + ") - $" + itemPrice;
    }
}

// Restaurant class
class Restaurant {
    private List<MenuItem> menu;
    private List<MenuItem> customerOrder;

    public Restaurant() {
        menu = new ArrayList<>();
        customerOrder = new ArrayList<>();
    }

    // Method to add items to the menu
    public void addMenuItem(MenuItem menuItem) {
        menu.add(menuItem);
    }

    // Display the menu
    public void displayMenu() {
        System.out.println("Menu:");
        for (int i = 0; i < menu.size(); i++) {
            System.out.println((i + 1) + ". " + menu.get(i));
        }
    }

    // Take customer order
    public void takeOrder() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            displayMenu();
            System.out.print("Enter the number of the item to add to your order (or 0 to finish): ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                break;
            } else if (choice > 0 && choice <= menu.size()) {
                MenuItem orderedItem = menu.get(choice - 1);
                customerOrder.add(orderedItem);
                System.out.println(orderedItem.getItemName() + " added to your order.");
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Calculate and display the bill
    public void displayBill() {
        if (customerOrder.isEmpty()) {
            System.out.println("No items ordered.");
            return;
        }

        System.out.println("\nYour Order:");
        double totalBill = 0.0;
        for (MenuItem item : customerOrder) {
            System.out.println(item);
            totalBill += item.getItemPrice();
        }
        System.out.println("Total Bill: $" + totalBill);
    }
}

// Main class
public class RestaurantOrderSystem {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();

        // Add items to the menu
        restaurant.addMenuItem(new MenuItem("Pizza", 12.99, "Main Course"));
        restaurant.addMenuItem(new MenuItem("Burger", 8.99, "Main Course"));
        restaurant.addMenuItem(new MenuItem("Pasta", 10.99, "Main Course"));
        restaurant.addMenuItem(new MenuItem("French Fries", 3.99, "Appetizer"));
        restaurant.addMenuItem(new MenuItem("Ice Cream", 4.99, "Dessert"));
        restaurant.addMenuItem(new MenuItem("Coke", 1.99, "Beverage"));

        // Restaurant system loop
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nRestaurant Menu:");
            System.out.println("1. Display Menu");
            System.out.println("2. Take Order");
            System.out.println("3. Display Bill");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    restaurant.displayMenu();
                    break;
                case 2:
                    restaurant.takeOrder();
                    break;
                case 3:
                    restaurant.displayBill();
                    break;
                case 4:
                    System.out.println("Thank you for visiting!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
