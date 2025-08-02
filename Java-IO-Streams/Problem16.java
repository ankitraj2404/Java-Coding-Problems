import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Problem16 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("C:/MyText/Customer.txt");
                ObjectInputStream ois = new ObjectInputStream(fis)) {

            int length = ois.readInt();
            Customer[] list = new Customer[length];

            for (int i = 0; i < length; i++) {
                list[i] = (Customer) ois.readObject();
            }

            for (Customer cst : list) {
                System.out.println(cst);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}
