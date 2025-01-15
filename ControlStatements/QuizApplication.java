import java.util.Scanner;

public class QuizApplication {

    public static void main(String[] args) {
        // Define questions, options, and correct answers
        String[] questions = {
            "What is the capital of France?",
            "Which planet is known as the Red Planet?",
            "What is the square root of 64?",
            "Who wrote 'To Kill a Mockingbird'?",
            "Which element has the chemical symbol 'O'?"
        };

        String[][] options = {
            {"1. Berlin", "2. Madrid", "3. Paris", "4. Rome"},
            {"1. Venus", "2. Mars", "3. Jupiter", "4. Saturn"},
            {"1. 6", "2. 7", "3. 8", "4. 9"},
            {"1. Harper Lee", "2. Mark Twain", "3. J.K. Rowling", "4. Ernest Hemingway"},
            {"1. Hydrogen", "2. Oxygen", "3. Nitrogen", "4. Helium"}
        };

        int[] answers = {3, 2, 3, 1, 2}; // Correct options for the questions

        // Initialize score
        int score = 0;

        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Quiz Application!");
        System.out.println("=================================\n");

        // Iterate through the questions using a for loop
        for (int i = 0; i < questions.length; i++) {
            System.out.println("Question " + (i + 1) + ": " + questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Your answer (choose 1-4): ");
            int userAnswer = scanner.nextInt();

            // Check if the answer is correct
            if (userAnswer == answers[i]) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong! The correct answer was option " + answers[i] + ".\n");
            }
        }

        // Display the final score
        System.out.println("Quiz Completed!");
        System.out.println("Your final score: " + score + "/" + questions.length);

        // Close the scanner
        scanner.close();
    }
}
