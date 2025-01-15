import java.util.Scanner;

public class ParkingLotFeeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Parking Lot Fee Calculator");
        System.out.println("===========================");

        // Input the number of vehicles
        System.out.print("Enter the number of vehicles: ");
        int numVehicles = scanner.nextInt();

        // Array to store parking durations and fees for each vehicle
        int[] hoursParked = new int[numVehicles];
        double[] parkingFees = new double[numVehicles];

        // Loop to calculate parking fees for each vehicle
        for (int i = 0; i < numVehicles; i++) {
            System.out.print("\nEnter hours parked for vehicle " + (i + 1) + ": ");
            hoursParked[i] = scanner.nextInt();

            // Calculate parking fee based on the rules
            if (hoursParked[i] <= 5) {
                parkingFees[i] = hoursParked[i] * 2;
            } else {
                parkingFees[i] = (5 * 2) + (hoursParked[i] - 5) * 1;
            }
        }

        // Display results
        System.out.println("\nParking Fee Details:");
        System.out.println("=====================");
        for (int i = 0; i < numVehicles; i++) {
            System.out.printf("Vehicle %d: Hours Parked = %d, Parking Fee = $%.2f%n",
                    (i + 1), hoursParked[i], parkingFees[i]);
        }

        scanner.close();
    }
}
