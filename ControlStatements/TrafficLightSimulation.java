import java.util.Scanner;

public class TrafficLightSimulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display instructions to the user
        System.out.println("Traffic Light Simulation");
        System.out.println("Enter a traffic light color (Red, Yellow, Green): ");

        // Take input from the user
        String lightColor = scanner.nextLine().trim().toLowerCase();

        // Simulate the traffic light system using a switch-case statement
        switch (lightColor) {
            case "red":
                System.out.println("Stop");
                break;

            case "yellow":
                System.out.println("Get Ready");
                break;

            case "green":
                System.out.println("Go");
                break;

            default:
                System.out.println("Invalid input! Please enter Red, Yellow, or Green.");
                break;
        }

        scanner.close();
    }
}
