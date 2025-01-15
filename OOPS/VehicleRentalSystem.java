class Vehicle {
    protected String vehicleType;
    protected String numberPlate;
    protected double rentalPricePerDay;

    public Vehicle(String vehicleType,String numberPlate,double rentalPricePerDay){
        this.vehicleType = vehicleType;
        this.numberPlate = numberPlate;
        this.rentalPricePerDay =rentalPricePerDay;  
    }

    public double calculateRentalCost(int days){
        return rentalPricePerDay* days;
    }

    public void displayDetails(){
        System.out.println("Vehical Type: " + vehicleType);
        System.out.println("Vehical Number: " + numberPlate);
        System.out.println("rental Price Per day: " + rentalPricePerDay);
        
    }
}

class Car extends Vehicle {
    private int seatingCapacity;
//constructor
    public Car(String numberPlate,double rentalPricePerDay,int seatingCapacity){
        super("Car",numberPlate,rentalPricePerDay);
        this.seatingCapacity = seatingCapacity;
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Seating capacity " + seatingCapacity);
    }
}

class Bike extends Vehicle{
    private boolean hasHelmetIncluded;

    //constructor
    public Bike(String numberPlate,double rentalPricePerDay,boolean hasHelmetIncluded){
        super ("Bike", numberPlate, rentalPricePerDay);
        this.hasHelmetIncluded= hasHelmetIncluded;
    }

    public void displayDetails(){
        super.displayDetails();
         System.out.println("Helmet Included: " + (hasHelmetIncluded ? "Yes" : "No"));
    }
    }


public class VehicleRentalSystem{
    public static void main(String args[]){
        Car car = new Car("MHCT0014",200,3);
        car.displayDetails();
        System.out.println("Total rental cost for 3 days is "+ car.calculateRentalCost(3));
        System.out.println();

        Bike bike = new Bike("MH12MN4613",5000,true);
        bike.displayDetails();
        System.out.println("Total rental cost for 5 days is "+ bike.calculateRentalCost(5));
        System.out.println();
    }
}