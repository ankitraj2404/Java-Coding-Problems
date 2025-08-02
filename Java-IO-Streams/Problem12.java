//Write a java program to read an object from a file using DataInputStream

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Problem12 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("C:/MyText/Student2.txt");
                DataInputStream dis = new DataInputStream(fis)) {

            Student st2 = new Student();
            st2.name = dis.readUTF();
            st2.dept = dis.readUTF();
            st2.rollNo = dis.readInt();

            System.out.println("Student Name: " + st2.name + "\n" + "Student dept: " + st2.dept + "\n"
                    + "Student Roll: " + st2.rollNo);

        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
