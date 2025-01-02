import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        
        String lowerCaseInput = input.toLowerCase();

        // Create a HashMap to store character frequencies
        Map<Character, Integer> charFrequency = new HashMap<>();

        // Count the frequency of each character
        for (char ch : lowerCaseInput.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) { // Consider only letters and digits
                charFrequency.put(ch, charFrequency.getOrDefault(ch, 0) + 1);
            }
        }

        // Display the character frequencies
        System.out.println("Character frequencies:");
        for (Map.Entry<Character, Integer> entry : charFrequency.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
