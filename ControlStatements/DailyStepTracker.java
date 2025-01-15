import java.util.Scanner;

public class DailyStepTracker {

    public static void main(String[] args) {
        final int DAYS_IN_WEEK = 7; // Number of days in a week
        int[] stepsPerDay = new int[DAYS_IN_WEEK];
        int totalSteps = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Daily Step Tracker");
        System.out.println("===================");

        // Loop to record steps for each day
        for (int i = 0; i < DAYS_IN_WEEK; i++) {
            System.out.print("Enter the steps taken on Day " + (i + 1) + ": ");
            int steps = scanner.nextInt();

            // Store the input and add it to the total
            stepsPerDay[i] = steps;
            totalSteps += steps;
        }

        // Calculate the average steps
        double averageSteps = (double) totalSteps / DAYS_IN_WEEK;

        // Display results
        System.out.println("\nWeekly Step Summary:");
        System.out.println("======================");
        System.out.println("Total steps for the week: " + totalSteps);
        System.out.println("Average steps per day: " + String.format("%.2f", averageSteps));

        scanner.close();
    }
}
