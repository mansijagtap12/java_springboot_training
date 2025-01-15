import java.util.Scanner;

public class BankATMSimulation{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        double balance= 5000.00;
        boolean running = true;

        System.out.println("Welcome to the ATM");

        while (running){
            System.out.println("\nATM Menu:");
            System.out.println("1. Check balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.println("Select an option: ");


            int choice = scanner.nextInt();

            switch (choice){
                case 1: 
                System.out.println("Your current balance is $ " + balance);
                break;

                case 2:
                    System.out.println("Enter Amout to deposite:  ");
                    double depositeAmount = scanner.nextDouble();
                    if (depositeAmount > 0) {
                        balance += depositAmount;
                        System.out.println("Successfully deposited $" + depositAmount);
                    } else {
                        System.out.println("Invalid amount. Please try again.");
                    }
                    break;


                    case 3: // Withdraw Money
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    if (withdrawAmount > 0 && withdrawAmount <= balance) {
                        balance -= withdrawAmount;
                        System.out.println("Successfully withdrew $" + withdrawAmount);
                    } else if (withdrawAmount > balance) {
                        System.out.println("Insufficient balance!");
                    } else {
                        System.out.println("Invalid amount. Please try again.");
                    }
                    break;

                case 4: // Exit
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");

            }

        }
         scanner.close();
    }
}