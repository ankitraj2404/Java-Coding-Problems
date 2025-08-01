
// Write a java Program to create a text file and store some text inside it.
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Problem1 {
    public static void main(String[] args) {

        try (FileOutputStream fos = new FileOutputStream("C:/MyText/Output.txt");) {

            String text = "Learn Java";
            fos.write(text.getBytes());

        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
