import java.util.Scanner;

public class SecondLargestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Check for valid array size
        if (n < 2) {
            System.out.println("Array should have at least two elements.");
            return;
        }

        // Input the array elements
        int[] numbers = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Initialize the largest and second largest variables
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Find the largest and second largest elements
        for (int num : numbers) {
            if (num > largest) {
                secondLargest = largest;  // Update second largest
                largest = num;  // Update largest
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;  // Update second largest
            }
        }

        // Output the result
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element in the array.");
        } else {
            System.out.println("Second largest element: " + secondLargest);
        }
    }
}
