import java.util.*;

public class MergeAndSortArrays{

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of First array: ");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];
        for(int i=0; i< size1; i++)
        {
            array1[i] = scanner.nextInt();
        }

       // Input the size and elements of the second array
        System.out.print("Enter the size of the second array: ");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];
        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < size2; i++) {
            array2[i] = scanner.nextInt();
        }

        // Merge the two arrays
        int[] mergedArray = new int[size1 + size2];
        System.arraycopy(array1, 0, mergedArray, 0, size1);
        System.arraycopy(array2, 0, mergedArray, size1, size2);

        // Sort the merged array
        Arrays.sort(mergedArray);

        // Display the sorted array
        System.out.println("Merged and sorted array:");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }

        scanner.close();

    }

}
