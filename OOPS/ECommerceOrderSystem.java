import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

// Customer class
class Customer {
    private int customerId;
    private String name;
    private String address;

    public Customer(int customerId, String name, String address) {
        this.customerId = customerId;
        this.name = name;
        this.address = address;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void displayDetails() {
        System.out.println("Customer ID: " + customerId);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
    }
}

// Order class
class Order {
    public int orderId;
    private Date orderDate;
    private ArrayList<String> orderedItems;

    public Order(int orderId) {
        this.orderId = orderId;
        this.orderDate = new Date(); // Current date and time
        this.orderedItems = new ArrayList<>();
    }

    public void addItem(String item) {
        orderedItems.add(item);
    }

    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Ordered Items: ");
        for (String item : orderedItems) {
            System.out.println("- " + item);
        }
    }
}

// Main class
public class ECommerceOrderSystem {
    private static ArrayList<Customer> customers = new ArrayList<>();
    private static ArrayList<Order> orders = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nE-Commerce Order System:");
            System.out.println("1. Add Customer");
            System.out.println("2. Create Order");
            System.out.println("3. Add Items to Order");
            System.out.println("4. Display Customer Details");
            System.out.println("5. Display Order Details");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addCustomer(scanner);
                    break;
                case 2:
                    createOrder(scanner);
                    break;
                case 3:
                    addItemsToOrder(scanner);
                    break;
                case 4:
                    displayCustomerDetails(scanner);
                    break;
                case 5:
                    displayOrderDetails(scanner);
                    break;
                case 6:
                    System.out.println("Thank you for using the E-Commerce Order System!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Add a new customer
    private static void addCustomer(Scanner scanner) {
        System.out.print("Enter customer ID: ");
        int customerId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline
        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();
        System.out.print("Enter customer address: ");
        String address = scanner.nextLine();
        customers.add(new Customer(customerId, name, address));
        System.out.println("Customer added successfully!");
    }

    // Create a new order
    private static void createOrder(Scanner scanner) {
        System.out.print("Enter order ID: ");
        int orderId = scanner.nextInt();
        orders.add(new Order(orderId));
        System.out.println("Order created successfully!");
    }

    // Add items to an existing order
    private static void addItemsToOrder(Scanner scanner) {
        System.out.print("Enter order ID: ");
        int orderId = scanner.nextInt();
        Order order = findOrder(orderId);

        if (order != null) {
            scanner.nextLine(); // Consume the newline
            System.out.print("Enter item to add: ");
            String item = scanner.nextLine();
            order.addItem(item);
            System.out.println("Item added successfully!");
        } else {
            System.out.println("Order not found.");
        }
    }

    // Display customer details
    private static void displayCustomerDetails(Scanner scanner) {
        System.out.print("Enter customer ID: ");
        int customerId = scanner.nextInt();
        Customer customer = findCustomer(customerId);

        if (customer != null) {
            customer.displayDetails();
        } else {
            System.out.println("Customer not found.");
        }
    }

    // Display order details
    private static void displayOrderDetails(Scanner scanner) {
        System.out.print("Enter order ID: ");
        int orderId = scanner.nextInt();
        Order order = findOrder(orderId);

        if (order != null) {
            order.displayOrderDetails();
        } else {
            System.out.println("Order not found.");
        }
    }

    // Find a customer by ID
    private static Customer findCustomer(int customerId) {
        for (Customer customer : customers) {
            if (customer.getCustomerId() == customerId) {
                return customer;
            }
        }
        return null;
    }

    // Find an order by ID
    private static Order findOrder(int orderId) {
        for (Order order : orders) {
            if (order.orderId == orderId) {
                return order;
            }
        }
        return null;
    }
}
