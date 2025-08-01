
// Write a java program to create ByteArrayOutputStream, CharArrayWriter and then write the date to them or to a file.
import java.io.ByteArrayOutputStream;
import java.io.CharArrayWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Problem7 {
    public static void main(String[] args) {
        try (ByteArrayOutputStream bos = new ByteArrayOutputStream(5);
                CharArrayWriter caw = new CharArrayWriter(5);
                FileWriter fw = new FileWriter("C:/MyText/Copy.txt", true)) {

            bos.write('a');
            bos.write('b');
            bos.write('c');
            bos.write('d');
            bos.write('e');
            bos.writeTo(new FileOutputStream("C:/MyText/Copy.txt"));

            caw.write('f');
            caw.write('g');
            caw.write('h');
            caw.write('i');
            caw.write('j');
            caw.writeTo(fw);
            fw.flush();

        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
