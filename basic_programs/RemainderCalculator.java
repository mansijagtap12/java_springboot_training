import java.util.Scanner;

public class RemainderCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        if (num2 != 0) {
            int remainder = num1 % num2;
            System.out.println("The remainder is: " + remainder);
        } else {
            System.out.println("Division by zero is not allowed.");
        }

        scanner.close();
    }
}
