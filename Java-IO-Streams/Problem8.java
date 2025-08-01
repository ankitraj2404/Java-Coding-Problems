
// Write a java program to create a new file and add some content into it.
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Problem8 {
    public static void main(String[] args) {
        try {
            File fw = new File("C:/MyText/Text.txt");

            if (fw.createNewFile()) {
                System.out.println("File Created " + fw.getName());
            } else {
                System.out.println("File already exist");
            }

            FileOutputStream fos = new FileOutputStream("C:/MyText/Text.txt");

            String txt = "Ankit Raj";
            fos.write(txt.getBytes());
            fos.close();

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
