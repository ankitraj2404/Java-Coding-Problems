//Write down a java program to store float array in a file in the from of float itself.

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Problem13 {
    public static void main(String[] args) {

        float[] arr = { 10.5f, 2.5f, 4.5f, 5.5f };
        try (FileOutputStream fos = new FileOutputStream("C:/Mytext/Float.txt");
                DataOutputStream dos = new DataOutputStream(fos)) {

            dos.writeInt(arr.length);// Store the length of the arr first, later while reading the file it will be
                                     // helpful

            for (float f : arr) {
                dos.writeFloat(f);
            }

        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}