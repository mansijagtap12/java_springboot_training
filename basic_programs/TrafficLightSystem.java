import java.util.Scanner;

public class TrafficLightSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for traffic light color
        System.out.println("Enter the traffic light color (Green, Yellow, Red): ");
        String lightColor = scanner.nextLine().toLowerCase();

        // Input for obstacle presence
        System.out.println("Is there an obstacle? (yes/no): ");
        String obstacle = scanner.nextLine().toLowerCase();

        // Check if there is an obstacle
        boolean isObstacle = obstacle.equals("yes");

        // Determine the action based on the light color and obstacle condition
        if (isObstacle) {
            System.out.println("There is an obstacle. You cannot move.");
        } else {
            switch (lightColor) {
                case "green":
                    System.out.println("Go!");
                    break;
                case "yellow":
                    System.out.println("Slow Down.");
                    break;
                case "red":
                    System.out.println("Stop.");
                    break;
                default:
                    System.out.println("Invalid light color.");
            }
        }

        scanner.close();
    }
}
