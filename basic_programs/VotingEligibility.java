import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input age and citizenship status
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character left after nextInt()

        System.out.print("Are you a citizen of the country? (yes/no): ");
        String citizenship = scanner.nextLine().toLowerCase();

        // Check if the person is eligible to vote
        if (age >= 18 && citizenship.equals("yes")) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }

        scanner.close();
    }
}
