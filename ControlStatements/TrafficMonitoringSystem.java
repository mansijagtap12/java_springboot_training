import java.util.Scanner;

public class TrafficMonitoringSystem {

    public static void main(String[] args) {
        final int TOTAL_INTERVALS = 12; // 12 intervals of 5 minutes in an hour
        int[] vehiclesPerInterval = new int[TOTAL_INTERVALS];
        int totalVehicles = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Traffic Monitoring System");
        System.out.println("==========================");

        // Loop to input the number of vehicles for each interval
        for (int i = 0; i < TOTAL_INTERVALS; i++) {
            System.out.print("Enter the number of vehicles passing in interval " + (i + 1) + " (5 minutes): ");
            int vehicles = scanner.nextInt();

            // Record the input and add to the total
            vehiclesPerInterval[i] = vehicles;
            totalVehicles += vehicles;
        }

        // Calculate the average number of vehicles per interval
        double averageVehicles = (double) totalVehicles / TOTAL_INTERVALS;

        // Display results
        System.out.println("\nTraffic Monitoring Summary:");
        System.out.println("============================");
        System.out.println("Total vehicles recorded: " + totalVehicles);
        System.out.println("Average vehicles per interval: " + String.format("%.2f", averageVehicles));

        scanner.close();
    }
}
