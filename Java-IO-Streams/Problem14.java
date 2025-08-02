
//Write a java program to extract the float array from the file.

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Problem14 {
    public static void main(String[] args) {

        try (FileInputStream fis = new FileInputStream("C:/Mytext/Float.txt");
                DataInputStream dis = new DataInputStream(fis)) {

            int length = dis.readInt();

            for (int i = 0; i < length; i++) {
                System.out.println(dis.readFloat());
            }

        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
