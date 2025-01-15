import java.util.Scanner;

public class CinemaSeatReservation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize the cinema with 5 rows and 6 columns
        int rows = 5, cols = 6;
        char[][] seats = new char[rows][cols];

        // Fill the seats array with 'A' for Available
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                seats[i][j] = 'A'; // 'A' represents Available
            }
        }

        boolean continueReservation = true;

        while (continueReservation) {
            System.out.println("Current Seat Layout:");
            displaySeats(seats);

            System.out.println("\nEnter the row and column of the seat you want to reserve:");
            System.out.print("Row (1-" + rows + "): ");
            int row = scanner.nextInt() - 1; // Adjusting for 0-based indexing
            System.out.print("Column (1-" + cols + "): ");
            int col = scanner.nextInt() - 1;

            // Check if the selected seat is available
            if (row >= 0 && row < rows && col >= 0 && col < cols) {
                if (seats[row][col] == 'A') {
                    seats[row][col] = 'R'; // 'R' represents Reserved
                    System.out.println("Seat reserved successfully!");
                } else {
                    System.out.println("Seat is already reserved. Please choose another seat.");
                }
            } else {
                System.out.println("Invalid seat selection. Please try again.");
            }

            // Ask the user if they want to continue reserving seats
            System.out.print("\nDo you want to reserve another seat? (yes/no): ");
            String response = scanner.next().toLowerCase();
            continueReservation = response.equals("yes");
        }

        System.out.println("\nFinal Seat Layout:");
        displaySeats(seats);
        System.out.println("Thank you for using the Cinema Seat Reservation System!");
        scanner.close();
    }

    // Method to display the current seat layout
    public static void displaySeats(char[][] seats) {
        System.out.print("  ");
        for (int col = 1; col <= seats[0].length; col++) {
            System.out.print(col + " ");
        }
        System.out.println();
        for (int i = 0; i < seats.length; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < seats[i].length; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }
    }
}
