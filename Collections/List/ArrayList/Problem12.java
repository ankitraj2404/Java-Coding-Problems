
//Write a Java program to insert an element at the beginning of an ArrayList and then shift all other elements to the right.
import java.util.ArrayList;
import java.util.Scanner;

public class Problem12 {
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

            int temp = list.get(size - 1);

            for (int i = size - 1; i > 0; i--) {
                list.set(i, list.get(i - 1));
            }
            list.add(0, temp);

        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
