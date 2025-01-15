import java.util.Scanner;

public class EmployeeAttendanceTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of employees
        System.out.print("Enter the number of employees: ");
        int n = scanner.nextInt();

        // Initialize an array to store attendance for each employee for 7 days
        String[][] attendance = new String[n][7];

        // Record attendance for each employee for 7 days
        for (int i = 0; i < n; i++) {
            System.out.println("Enter attendance for Employee " + (i + 1) + " (Present/Absent):");
            for (int j = 0; j < 7; j++) {
                System.out.print("Day " + (j + 1) + ": ");
                attendance[i][j] = scanner.next();
            }
            System.out.println();
        }

        // Display the recorded attendance
        System.out.println("\nAttendance Record for the Week:");
        for (int i = 0; i < n; i++) {
            System.out.print("Employee " + (i + 1) + ": ");
            for (int j = 0; j < 7; j++) {
                System.out.print(attendance[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
