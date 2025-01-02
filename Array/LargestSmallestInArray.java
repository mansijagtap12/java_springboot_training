import java.util.Scanner;

public class LargestSmallestInArray {
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

        // Initialize variables for largest and smallest numbers
        int largest = numbers[0];
        int smallest = numbers[0];

        // Find the largest and smallest numbers
        for (int num : numbers) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }

        // Output the results
        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);
    }
}
