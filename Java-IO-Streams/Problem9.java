//Write a java program to write an object to a file using printstream.

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

class Student {
    String name;
    int rollNo;
    String dept;
}

public class Problem9 {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("C:/MyText/Student1.txt");
                PrintStream ps = new PrintStream(fos)) {

            Student st1 = new Student();
            st1.name = "Ankit";
            st1.dept = "CSE";
            st1.rollNo = 10;

            ps.println(st1.name);
            ps.println(st1.dept);
            ps.println(st1.rollNo);

        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
