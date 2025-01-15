import java.util.Scanner;

public class StudentGradingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Number of students
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        double totalGrades = 0; // Variable to store the total grades
        int failedStudents = 0; // Counter for failed students

        // Loop to input grades for each student
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter the grade for Student " + i + ": ");
            int grade = scanner.nextInt();

            // Add to total grades
            totalGrades += grade;

            // Check if the student has failed
            if (grade < 40) {
                System.out.println("Student " + i + " has failed.");
                failedStudents++;
            }
        }

        // Calculate and display the average grade
        double averageGrade = totalGrades / n;
        System.out.println("\nAverage Grade of the Class: " + averageGrade);

        // Display the number of failed students
        System.out.println("Number of students who failed: " + failedStudents);

        scanner.close();
    }
}
