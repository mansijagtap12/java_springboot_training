import java.util.ArrayList;
import java.util.Scanner;

// Student class
class Student {
    private String name;
    private int rollNumber;
    private ArrayList<Double> grades;
    private int attendance;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grades = new ArrayList<>();
        this.attendance = 0;
    }

    // Add a grade
    public void addGrade(double grade) {
        grades.add(grade);
    }

    // Mark attendance
    public void markAttendance() {
        attendance++;
    }

    // Calculate average grade
    public double calculateAverageGrade() {
        if (grades.isEmpty()) {
            return 0.0;
        }
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    // Display student details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Attendance: " + attendance + " days");
        System.out.printf("Average Grade: %.2f%n", calculateAverageGrade());
    }

    public int getRollNumber() {
        return rollNumber;
    }
}

// School Management System class
public class SchoolManagementSystem {
    private static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nSchool Management System:");
            System.out.println("1. Add Student");
            System.out.println("2. Add Grade for Student");
            System.out.println("3. Mark Attendance for Student");
            System.out.println("4. Display Student Details");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addStudent(scanner);
                    break;
                case 2:
                    addGrade(scanner);
                    break;
                case 3:
                    markAttendance(scanner);
                    break;
                case 4:
                    displayStudentDetails(scanner);
                    break;
                case 5:
                    System.out.println("Thank you for using the School Management System!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Add a new student
    private static void addStudent(Scanner scanner) {
        System.out.print("Enter student name: ");
        scanner.nextLine(); // Consume the newline
        String name = scanner.nextLine();
        System.out.print("Enter roll number: ");
        int rollNumber = scanner.nextInt();
        students.add(new Student(name, rollNumber));
        System.out.println("Student added successfully!");
    }

    // Add a grade to a student
    private static void addGrade(Scanner scanner) {
        System.out.print("Enter roll number: ");
        int rollNumber = scanner.nextInt();
        Student student = findStudent(rollNumber);

        if (student != null) {
            System.out.print("Enter grade: ");
            double grade = scanner.nextDouble();
            student.addGrade(grade);
            System.out.println("Grade added successfully!");
        } else {
            System.out.println("Student not found.");
        }
    }

    // Mark attendance for a student
    private static void markAttendance(Scanner scanner) {
        System.out.print("Enter roll number: ");
        int rollNumber = scanner.nextInt();
        Student student = findStudent(rollNumber);

        if (student != null) {
            student.markAttendance();
            System.out.println("Attendance marked successfully!");
        } else {
            System.out.println("Student not found.");
        }
    }

    // Display details of a student
    private static void displayStudentDetails(Scanner scanner) {
        System.out.print("Enter roll number: ");
        int rollNumber = scanner.nextInt();
        Student student = findStudent(rollNumber);

        if (student != null) {
            student.displayDetails();
        } else {
            System.out.println("Student not found.");
        }
    }

    // Find a student by roll number
    private static Student findStudent(int rollNumber) {
        for (Student student : students) {
            if (student.getRollNumber() == rollNumber) {
                return student;
            }
        }
        
       return null;
    }
}
