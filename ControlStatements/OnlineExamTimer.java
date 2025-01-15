import java.util.concurrent.TimeUnit;

public class OnlineExamTimer {

    public static void main(String[] args) {
        // Total exam time in minutes
        int totalTime = 10; // Example: 10 minutes for the exam
        
        System.out.println("Online Exam Timer");
        System.out.println("===================");
        System.out.println("The exam starts now! Total time: " + totalTime + " minutes.\n");

        // Countdown timer
        while (totalTime > 0) {
            System.out.println("Time remaining: " + totalTime + " minutes.");
            totalTime--;

            // Wait for 1 minute (simulate a delay)
            try {
                TimeUnit.SECONDS.sleep(60); // 60 seconds for real-time simulation
            } catch (InterruptedException e) {
                System.out.println("Timer interrupted!");
            }
        }

        System.out.println("\nTime's up! The exam has ended.");
    }
}
