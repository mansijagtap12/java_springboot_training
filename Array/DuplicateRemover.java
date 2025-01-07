import java.util.*;

public class DuplicateRemover {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Input array elements
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Remove duplicates using a HashSet
        Set<Integer> uniqueElements = new LinkedHashSet<>();
        for (int num : array) {
            uniqueElements.add(num);
        }

        // Display the unique elements
        System.out.println("Array after removing duplicates:");
        for (int unique : uniqueElements) {
            System.out.print(unique + " ");
        }

        scanner.close();
    }
}
