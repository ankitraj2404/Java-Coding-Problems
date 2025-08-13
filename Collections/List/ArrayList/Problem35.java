//Write a Java program to sort an ArrayList of custom objects by a specific attribute using Comparator.comparing().

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class Student {
    String stdName;
    int rollNo;

    public Student(String stdName, int rollNo) {
        this.stdName = stdName;
        this.rollNo = rollNo;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "[Name=" + stdName + ", Roll-No=" + rollNo + "]";
    }

}

public class Problem35 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("How many Students do you want?");
            int size = sc.nextInt();
            sc.nextLine();
            ArrayList<Student> list = new ArrayList<>();
            int counter = 1;

            while (counter <= size) { // Add Student in the list
                System.out.println("Enter student name and roll no: ");
                String name = sc.nextLine();
                int rollNo = sc.nextInt();
                sc.nextLine();
                Student std1 = new Student(name, rollNo);
                list.add(std1);
                System.out.println(counter + " student added");
                counter++;
            }

            System.out.println("Original list: " + list);
            list.sort(Comparator.comparing(Student::getRollNo));
            System.out.println("List after sorting on the basis of their rollNo: " +
                    list);
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
