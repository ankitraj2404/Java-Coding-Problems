
// Write a java program to read content from a file using FileInputStream
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Problem2 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("C:/MyText/Output.txt")) {

            int x;

            while ((x = fis.read()) != -1) {
                System.out.print((char) x);
            }

        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
