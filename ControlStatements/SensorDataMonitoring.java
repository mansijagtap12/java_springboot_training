import java.util.Random;

public class SensorDataMonitoring {

    public static void main(String[] args) {
        Random random = new Random();
        int threshold = 90; // Define the threshold value
        int highestValue = Integer.MIN_VALUE; // Store the highest sensor value
        int readingsCount = 0; // Counter for the number of readings taken

        System.out.println("Sensor Data Monitoring System");
        System.out.println("====================================");
        System.out.println("Monitoring sensor data...");

        while (true) {
            // Simulate a sensor value
            int sensorValue = random.nextInt(100); // Generate a random value between 0 and 99
            readingsCount++;

            // Update the highest value recorded
            if (sensorValue > highestValue) {
                highestValue = sensorValue;
            }

            // Display the current sensor value
            System.out.println("Reading #" + readingsCount + ": Sensor Value = " + sensorValue);

            // Check if the sensor value exceeds the threshold
            if (sensorValue > threshold) {
                System.out.println("\nThreshold exceeded! Sensor value = " + sensorValue);
                break;
            }

            // Simulate a delay for the next reading
            try {
                Thread.sleep(500); // 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println("Monitoring interrupted!");
                break;
            }
        }

        // Display the final results
        System.out.println("\nMonitoring Stopped.");
        System.out.println("Total Readings Taken: " + readingsCount);
        System.out.println("Highest Sensor Value Recorded: " + highestValue);
    }
}
