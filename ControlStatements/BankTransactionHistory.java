import java.util.Scanner;

public class BankTransactionHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = 0.0; // Initial balance
        int choice;

        System.out.println("Welcome to the Bank Transaction System!");

        do {
            // Display menu
            System.out.println("\nChoose an option:");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Quit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Deposit money
                    System.out.print("Enter amount to deposit: ");
                    double deposit = scanner.nextDouble();
                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("Deposited: $" + deposit);
                    } else {
                        System.out.println("Invalid amount. Deposit failed.");
                    }
                    break;

                case 2:
                    // Withdraw money
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawal = scanner.nextDouble();
                    if (withdrawal > 0 && withdrawal <= balance) {
                        balance -= withdrawal;
                        System.out.println("Withdrew: $" + withdrawal);
                    } else if (withdrawal > balance) {
                        System.out.println("Insufficient funds. Withdrawal failed.");
                    } else {
                        System.out.println("Invalid amount. Withdrawal failed.");
                    }
                    break;

                case 3:
                    // Check balance
                    System.out.println("Current Balance: $" + balance);
                    break;

                case 4:
                    // Quit
                    System.out.println("Thank you for using the Bank Transaction System. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
