import java.util.Scanner;

public class ElementSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Check for valid array size
        if (n <= 0) {
            System.out.println("Array size must be greater than 0.");
            return;
        }

        // Input the array elements
        int[] numbers = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Input the element to search for
        System.out.print("Enter the element to search for: ");
        int target = scanner.nextInt();

        // Search for the element in the array
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (numbers[i] == target) {
                System.out.println("Element found at position: " + (i + 1)); // Position is 1-based
                found = true;
                break;
            }
        }

        // If the element is not found
        if (!found) {
            System.out.println("Element not found in the array.");
        }
    }
}
