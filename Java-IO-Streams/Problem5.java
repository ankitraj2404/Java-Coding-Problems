// Write a java program to copy content from two file to one file

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class Problem5 {
    public static void main(String[] args) {
        try (FileInputStream fis1 = new FileInputStream("C:/MyText/Output.txt");
                FileInputStream fis2 = new FileInputStream("C:/MyText/Copy.txt");
                FileOutputStream fos = new FileOutputStream("C:/MyText/Destination.txt");
                SequenceInputStream sis = new SequenceInputStream(fis1, fis2);
                FileInputStream fis3 = new FileInputStream("C:/MyText/Destination.txt")) {

            int b;

            while ((b = sis.read()) != -1) {

                fos.write(b);
            }

            byte[] arr = new byte[fis3.available()];
            fis3.read(arr);

            String str = new String(arr);
            System.out.println("Copied content in the destination file: " + str);

        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
