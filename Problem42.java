import java.util.InputMismatchException;
import java.util.Scanner;

class Student { // Student class with properties and methods
    public String name;
    public int mark1, mark2, mark3;
    public int roll;
    public String course;

    public int total() {
        return mark1 + mark2 + mark3;
    }

    public float average() {
        return (float) total() / 3;
    }

    public char grade() {
        if (average() >= 60)
            return 'A';
        else
            return 'B';
    }

    public String toString() {
        return "Name: " + name + "\n" + "Roll No: " + roll + "\n" + "Course: " + course;
    }

}

public class Problem42 {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the name, roll no of the student: ");
            String name = sc.nextLine();
            int rollNo = sc.nextInt();

            System.out.println("Enter the marks of the student: ");
            int mark1 = sc.nextInt();
            int mark2 = sc.nextInt();
            int mark3 = sc.nextInt();

            sc.nextLine();
            System.out.println("Enter the course of the student: ");
            String course = sc.nextLine();

            Student stud = new Student();
            stud.name = name;
            stud.roll = rollNo;
            stud.mark1 = mark1;
            stud.mark2 = mark2;
            stud.mark3 = mark3;
            stud.course = course;
            System.out.println("_________________________");
            System.out.println(stud);
            System.out.println("Total marks: " + stud.total());
            System.out.println("Average Marks: " + stud.average());
            System.out.println("Grade: " + stud.grade());

        } catch (InputMismatchException e) {
            System.out.println("Enter valid inputs");
        } finally {
            sc.close();
        }
    }

}
