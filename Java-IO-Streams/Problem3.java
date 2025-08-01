// Write a java program to write a text into a file using FileWriter

import java.io.FileWriter;
import java.io.IOException;

public class Problem3 {

    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("C:/MyText/Output.txt", true)) {

            String str = " Programming with Abdul Bari";
            fw.write(str);

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
