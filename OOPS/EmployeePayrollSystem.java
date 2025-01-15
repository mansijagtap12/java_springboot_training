// Base Employee Class

class Employee{
    protected String name;
    protected int id;
    protected String designation;
    protected double basicSalary;

    public Employee (String name,int id, String designation,double basicSalary){
        this.name = name;
        this.id = id;
        this.designation = designation;
        this.basicSalary = basicSalary;
    }


public double calculateSalary(){
    return basicSalary;
}

public void displayDetails(){
    System.out.println("Employee Id:" + id);
    System.out.println("Employee Name:" + name);
    System.out.println("Employee designation:" + designation);
    System.out.println("Employee basicSalary:" + basicSalary);
}
}
class FullTimeEmployee extends Employee{
    private double hra;
    private double da;

    public FullTimeEmployee(String name,int id,String designation , double basicSalary ,double hra , double da){
        super (name ,id,designation,basicSalary);
        this.hra = hra;
        this.da = da;
    }


 @Override
public double calculateSalary(){
    return basicSalary + hra + da;
}
}

class PartTimeEmployee extends Employee{
    private double hourlyWage;
    private int hoursWorked;
                            
    public PartTimeEmployee (String name,int id,String designation , double hourlyWage ,int hoursWorked){
        super(name, id, designation, 0); 
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    } 


     @Override
    public double calculateSalary() {
        return hourlyWage * hoursWorked;
    }
}

public class EmployeePayrollSystem{
    public static void main(String args[]){
        FullTimeEmployee fullTimeEmployee= new FullTimeEmployee("Mansi", 101, "Software Engineer", 50000, 10000, 5000) ;
        fullTimeEmployee.displayDetails();

        System.out.println();

        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Gayatri",102, "Data Entry Operator", 500, 20);
        partTimeEmployee.displayDetails();
    }
}