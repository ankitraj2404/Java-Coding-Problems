
//Write a Java program to insert an element into the array list at the first position.
import java.util.ArrayList;
import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("How many values do you want: ");
            int size = sc.nextInt();

            ArrayList<Integer> list = new ArrayList<>();

            while (size > 0) {
                list.add(sc.nextInt());
                size--;
            }

            System.out.println("original List: " + list);

            System.out.println("Enter the element you want to enter at the first index: ");
            int num = sc.nextInt();

            list.add(0, num);

            System.out.println("List after adding " + num + " at 0th index: " + list);

        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
