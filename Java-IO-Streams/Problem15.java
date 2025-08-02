
//Write a java program to store the array of an object and automatically generate the id of the object
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Customer implements Serializable {
    private String custId;
    private String name;
    private int age;

    static int count = 1;

    public Customer() {
    }

    public Customer(String name, int age) {
        custId = "C" + count;
        count++;

        this.name = name;
        this.age = age;

    }

    public String toString() {
        return "CustomerID: " + custId + "\n"
                + "Customer name: " + name + "\n"
                + "Customer age: " + age + "\n";
    }

}

public class Problem15 {
    public static void main(String[] args) {

        try (FileOutputStream fos = new FileOutputStream("C:/MyText/Customer.txt");
                ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            Customer list[] = { new Customer("Ankit", 25), new Customer("Aditya", 22), new Customer("Shubham", 28) };

            oos.writeInt(list.length);
            for (Customer c : list) {
                oos.writeObject(c);
            }

        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
