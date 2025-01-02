import java.util.Scanner;

public class SumAndAverage{
    public static void main(String[] args){
        
    Scanner scanner =new Scanner(System.in);

    System.out.print("Enter the number of element in the array: ");
    int n = scanner.nextInt();

    if(n <= 0){
        System.out.print("Array Size Must be greater Than 0");
        return;
    }

    int[] number = new int[n];
    System.out.println("Enter the Element of the Array:");
    for (int i=0; i<n ; i++){
        number[i] = scanner.nextInt();
    }

    int sum = 0;
    for(int num : number){
        sum += num;
    }
    double average =(double)sum /n;

    System.out.println("Sum of array elements: " + sum);
    System.out.println("Average of array elements: " + average);

    }
}