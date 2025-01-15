import java.util.Scanner;

public class LibraryFineCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Number of books
        System.out.print("Enter the number of books to calculate fines for: ");
        int numBooks = scanner.nextInt();

        // Process each book's overdue days
        for (int i = 1; i <= numBooks; i++) {
            System.out.print("Enter the overdue days for Book " + i + ": ");
            int overdueDays = scanner.nextInt();

            // Calculate the fine
            int fine = 0;
            if (overdueDays <= 7) {
                fine = overdueDays * 1; // $1/day for the first 7 days
            } else {
                fine = (7 * 1) + ((overdueDays - 7) * 2); // $1/day for first 7 days + $2/day afterward
            }

            // Display fine for the current book
            System.out.println("Fine for Book " + i + ": $" + fine);
        }

        scanner.close();
    }
}
