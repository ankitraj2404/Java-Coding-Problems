
// Write a Java program to iterate through all elements in an array list.
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            ArrayList<Integer> age = new ArrayList<>();

            System.out.println("How many values do you want to enter?");
            int size = sc.nextInt();
            sc.nextLine();
            int i = 0;

            System.out.println("Enter elements: ");
            while (i < size) {
                Integer value = sc.nextInt();
                age.add(value);
                i++;
            }

            Iterator<Integer> it = age.iterator(); // iterating through iterator
            System.out.print("List: ");
            while (it.hasNext()) {
                System.out.print(it.next() + " ");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
