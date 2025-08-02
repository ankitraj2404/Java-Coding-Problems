// Write a java program read an object from a file using BufferedReader.

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem10 {
    public static void main(String[] args) {

        try (FileInputStream fis = new FileInputStream("C:/MyText/Student1.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(fis))) {

            Student st1 = new Student();
            st1.name = br.readLine();
            st1.dept = br.readLine();
            st1.rollNo = Integer.parseInt(br.readLine());

            System.out.println(
                    "Student Name: " + st1.name + " Student dept: " + st1.dept + " Student rollNo: " + st1.rollNo);

        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}