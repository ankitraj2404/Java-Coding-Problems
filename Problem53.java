
/*
 Write a Java program to create a class called "Employee" with a name, salary, 
 and hire date attributes, and a method to calculate years of service.
 */
import java.util.*;

class Employee {
    private String empName;
    private double salary;
    private int yearOfJoining;

    public Employee(String empName, double salary) {
        this.empName = empName;
        this.salary = salary;
    }

    public void setYearOfJoining(int yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }

    public int calculateYearOfExperience() {
        Calendar cal = Calendar.getInstance();
        int currentYear = cal.get(Calendar.YEAR);
        int yearOfExperience = currentYear - yearOfJoining;
        return yearOfExperience;
    }

    public String toString() {
        return "Employee Name: " + empName + "\n"
                + "Salary of the Employee: " + salary + "\n"
                + "Total year of experience: " + calculateYearOfExperience();
    }
}

public class Problem53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter your name: ");
            String empName = sc.nextLine();
            double salary = sc.nextDouble();

            System.out.println("Enter your year of joining: ");
            int yearOfExperience = sc.nextInt();

            Employee emp = new Employee(empName, salary);
            emp.setYearOfJoining(yearOfExperience);
            System.out.println(emp);

        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        } finally {
            sc.close();
        }
    }

}
