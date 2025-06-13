
// Write a Java program to create a class called "Employee" with a name, job title, and salary attributes, and methods to calculate and update salary.
import java.util.*;

class Employee {
    private String empName;
    private String jobTitle;
    private int yearOfExperience;
    private int empSalary;

    public Employee(String empName, String jobTitle, int yearOfExperience) {
        this.empName = empName;
        this.jobTitle = jobTitle;
        this.yearOfExperience = yearOfExperience;
    }

    public int salary(int yearOfExperience) {

        if (yearOfExperience > 5) {
            empSalary = 85000;
        } else {
            empSalary = 40000;
        }
        return empSalary;
    }

    public String toString() {
        return "Employee Name: " + empName + "\n"
                + "Job Title: " + jobTitle + "\n"
                + "Total year of experience: " + yearOfExperience + "\n"
                + "Calculated Salary: " + salary(yearOfExperience);
    }
}

public class Problem50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Name and current job title: ");
        String empName = sc.nextLine();
        String jobTitle = sc.nextLine();

        System.out.println("Enter your total experience in years: ");
        int yearOfExperience = sc.nextInt();

        Employee emp1 = new Employee(empName, jobTitle, yearOfExperience);
        System.out.println(emp1);
        sc.close();

    }

}
