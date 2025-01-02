import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArraySorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Check for valid array size
        if (n <= 0) {
            System.out.println("Array size must be greater than 0.");
            return;
        }

        // Input the array elements
        Integer[] numbers = new Integer[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Sort the array in ascending order
        Arrays.sort(numbers);
        System.out.println("Array in ascending order: " + Arrays.toString(numbers));

        // Sort the array in descending order
        Arrays.sort(numbers, Collections.reverseOrder());
        System.out.println("Array in descending order: " + Arrays.toString(numbers));
    }
}
