import java.util.ArrayList;
import java.util.Scanner;

// Question Class
class Question {
    private String questionText;
    private String[] options;
    private int correctAnswer;

    // Constructor
    public Question(String questionText, String[] options, int correctAnswer) {
        this.questionText = questionText;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    // Display the question and options
    public void displayQuestion() {
        System.out.println(questionText);
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
    }

    // Check if the user's answer is correct
    public boolean isCorrectAnswer(int userAnswer) {
        return userAnswer == correctAnswer;
    }
}

// Quiz Class
class Quiz {
    private ArrayList<Question> questions;
    private int score;

    // Constructor
    public Quiz() {
        questions = new ArrayList<>();
        score = 0;
    }

    // Add a question to the quiz
    public void addQuestion(Question question) {
        questions.add(question);
    }

    // Start the quiz
    public void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Online Examination!");
        System.out.println("----------------------------------");

        for (int i = 0; i < questions.size(); i++) {
            System.out.println("Question " + (i + 1) + ":");
            questions.get(i).displayQuestion();
            System.out.print("Enter your answer (1-4): ");
            int userAnswer = scanner.nextInt();

            if (questions.get(i).isCorrectAnswer(userAnswer)) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong answer!\n");
            }
        }

        System.out.println("Quiz Finished!");
        System.out.println("Your Score: " + score + "/" + questions.size());
        scanner.close();
    }
}

// Main Class
public class OnlineExaminationSystem {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();

        // Adding questions to the quiz
        quiz.addQuestion(new Question(
                "What is the capital of France?",
                new String[]{"Paris", "London", "Rome", "Berlin"},
                1
        ));

        quiz.addQuestion(new Question(
                "Which programming language is used for Android development?",
                new String[]{"Python", "Java", "C++", "Ruby"},
                2
        ));

        quiz.addQuestion(new Question(
                "Which planet is known as the Red Planet?",
                new String[]{"Earth", "Venus", "Mars", "Jupiter"},
                3
        ));

        // Start the quiz
        quiz.start();
    }
}
