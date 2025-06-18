import java.util.Scanner;

public class Student {
    // Attributes
    String name;
    int[] marks = new int[3];

    // Method to take input
    public void takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        name = sc.nextLine();

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + " (out of 100): ");
            marks[i] = sc.nextInt();
        }
    }

    // Method to calculate total
    public int getTotal() {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return sum;
    }

    // Method to get result
    public String getResult() {
        return (getTotal() > 300) ? "Pass" : "Fail";
    }

    // Method to display info
    public void displayInfo() {
        System.out.println("\n--- Student Report ---");
        System.out.println("Name: " + name);
        System.out.print("Marks: ");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println("\nTotal Marks: " + getTotal());
        System.out.println("Result: " + getResult());
    }

    // Main method
    public static void main(String[] args) {
        Student student = new Student();
        student.takeInput();
        student.displayInfo();
    }
}