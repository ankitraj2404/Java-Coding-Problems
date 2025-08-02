//Write a java program to store an object to a file using DataOutPutStream 

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Problem11 {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("C:/MyText/Student2.txt");
                DataOutputStream dos = new DataOutputStream(fos)) {

            Student st2 = new Student();
            st2.name = "Aditya";
            st2.dept = "CSE";
            st2.rollNo = 11;

            dos.writeUTF(st2.name);
            dos.writeUTF(st2.dept);
            dos.writeInt(st2.rollNo);

        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
