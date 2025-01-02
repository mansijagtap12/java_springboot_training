import java.util.Scanner;

public class VowelConsonantCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Count vowels and consonants
        int vowels = 0;
        int consonants = 0;

        // Convert the string to lowercase for easier comparison
        String lowerCaseInput = input.toLowerCase();

        for (char ch : lowerCaseInput.toCharArray()) {
            if (Character.isLetter(ch)) { // Check if the character is a letter
                if (isVowel(ch)) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        // Display the counts
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
    }

    // Helper method to check if a character is a vowel
    public static boolean isVowel(char ch) {
        return "aeiou".indexOf(ch) != -1;
    }
}
