
//Write a Java program to retrieve multiple elements from an ArrayList based on an array of indices provided by the user.
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem18 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("How many elements do you want to enter?");
            int size = sc.nextInt();

            ArrayList<Integer> list = new ArrayList<>();

            System.out.println("Enter elements: ");
            for (int i = 0; i < size; i++) {
                int num = sc.nextInt();
                list.add(num);
            }

            System.out.println("Orgininal list: " + list);

            System.out.println("How many elements you want to retrieve from the list of size " + (size - 1) + "?");
            int count = sc.nextInt();

            List<Integer> extracted = new ArrayList<>();

            System.out.println("Enter index values you want to retrieve between 0 " + (size - 1) + ": ");
            for (int i = 0; i < count; i++) {
                int index = sc.nextInt();
                extracted.add(list.get(index));
            }
            System.out.println("The retrieved values from the list: " + extracted);
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
