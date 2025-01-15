import java.util.Scanner;

public class ElectricityBillCalculator{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter The Number of units cosumed: ");
        int units = scanner.nextInt();

        double billAmount = 0;

        if (units <=100){
            billAmount = units*1;
        }
        else if(units <= 200){
            billAmount = (100*1) + ((units-100) * 2);
        }else{
            billAmount =(100 * 1)+ (100 * 2)+ ((units - 200 )*3 );

        }
        System.out.println("Electricity Bill:");
        System.out.println("Units Consumed: " + units);
        System.out.println("Total Bill Amount: $" + billAmount);

        scanner.close();
    }
}