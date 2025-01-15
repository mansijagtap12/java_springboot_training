// Base BankAccount Class
class BankAccount {
    protected String accountHolderName;
    protected String accountNumber;
    protected double balance;

    // Constructor
    public BankAccount(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Successfully withdrew: " + amount);
        } else if (amount > 0) {
            System.out.println("Insufficient balance!");
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
    }

    // Method to check balance
    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

    // Display account details
    public void displayDetails() {
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

// SavingsAccount Class
class SavingsAccount extends BankAccount {
    private final double minimumBalance;

    // Constructor
    public SavingsAccount(String accountHolderName, String accountNumber, double balance, double minimumBalance) {
        super(accountHolderName, accountNumber, balance);
        this.minimumBalance = minimumBalance;
    }

    // Override withdraw method to enforce minimum balance rule
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (balance - amount) >= minimumBalance) {
            balance -= amount;
            System.out.println("Successfully withdrew: " + amount);
        } else if (amount > 0) {
            System.out.println("Withdrawal denied! Maintaining a minimum balance of: " + minimumBalance);
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
    }
}

// CurrentAccount Class
class CurrentAccount extends BankAccount {
    private final double overdraftLimit;

    // Constructor
    public CurrentAccount(String accountHolderName, String accountNumber, double balance, double overdraftLimit) {
        super(accountHolderName, accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    // Override withdraw method to allow overdraft
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (balance - amount) >= -overdraftLimit) {
            balance -= amount;
            System.out.println("Successfully withdrew: " + amount);
        } else if (amount > 0) {
            System.out.println("Withdrawal denied! Overdraft limit exceeded: " + overdraftLimit);
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
    }
}

// Main Class to Test the Banking System
public class BankingSystem {
    public static void main(String[] args) {
        // Create a Savings Account
        SavingsAccount savingsAccount = new SavingsAccount("Alice", "SA12345", 5000, 1000);
        savingsAccount.displayDetails();
        savingsAccount.deposit(2000);
        savingsAccount.withdraw(4000);
        savingsAccount.checkBalance();
        System.out.println();

        // Create a Current Account
        CurrentAccount currentAccount = new CurrentAccount("Bob", "CA98765", 10000, 5000);
        currentAccount.displayDetails();
        currentAccount.deposit(3000);
        currentAccount.withdraw(15000);
        currentAccount.withdraw(17000); // Should exceed overdraft limit
        currentAccount.checkBalance();
    }
}
