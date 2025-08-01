// Write a java program to copy one the content from one file to another

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Problem4 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("C:/MyText/Output.txt");
                FileOutputStream fos = new FileOutputStream("C:/MyText/Copy.txt");
                FileInputStream fis1 = new FileInputStream("C:/MyText/Copy.txt")) {

            int b;

            while ((b = fis.read()) != -1) {

                if (b >= 65 && b <= 90)
                    fos.write(b + 32);
                else
                    fos.write(b);
            }

            byte[] arr = new byte[fis1.available()];

            fis1.read(arr);

            String str = new String(arr);

            System.out.println("The copied content is: " + str);

        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
