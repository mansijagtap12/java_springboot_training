import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class LotteryNumberGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Lottery Number Generator");
        System.out.println("==========================");

        System.out.print("Enter the number of lottery numbers to generate: ");
        int n = scanner.nextInt();

        // Use a HashSet to ensure no duplicate numbers
        HashSet<Integer> lotteryNumbers = new HashSet<>();

        while (lotteryNumbers.size() < n) {
            int number = random.nextInt(100) + 1; // Generate numbers between 1 and 100
            lotteryNumbers.add(number);
        }

        System.out.println("\nGenerated Lottery Numbers:");
        for (int num : lotteryNumbers) {
            System.out.print(num + " ");
        }

        System.out.println("\nGood luck!");
        scanner.close();
    }
}
