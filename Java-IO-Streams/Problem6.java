// Write a java program to create a ByteInputStream, CharArrayReader and read the data.

import java.io.ByteArrayInputStream;
import java.io.CharArrayReader;
import java.io.IOException;

public class Problem6 {
    public static void main(String[] args) {

        byte[] arr = { 'a', 'b', 'c', 'd', 'e', 'f' };
        char[] arr1 = { 'g', 'h', 'i', 'j', 'k', 'l' };

        try (ByteArrayInputStream bis = new ByteArrayInputStream(arr);
                CharArrayReader cas = new CharArrayReader(arr1)) {

            int b; // Reading from byte array
            while ((b = bis.read()) != -1) {
                System.out.print((char) b + " ");
            }

            int c; // Reading from character array
            while ((c = cas.read()) != -1) {
                System.out.print((char) c + " ");
            }

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
