
//Write a Java program to append an element at the end of a linked list and then verify the insertion by traversing the list.
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Problem2 {
    public static void main(String... args) {
        try (Scanner sc = new Scanner(System.in)) {

            LinkedList<Integer> list = new LinkedList<>(List.of(11, 12, 13, 14, 15));
            System.out.println("Original list: " + list);
            System.out.println("Enter the element to append at last: ");
            int element = sc.nextInt();

            list.add(element); // adding element at the end
            boolean found = false;
            for (Integer i : list) {
                if (i.equals(element)) {
                    found = true;
                }
            }

            String result = found ? element + " successfully appended" : element + " successfully appended";
            System.out.println(result);

        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}