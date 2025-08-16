
//Write a Java program to append the specified element to the end of a linked list.
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            LinkedList<Integer> list = new LinkedList<>(List.of(11, 12, 13, 14, 15));
            System.out.println("Original list: " + list);
            System.out.println("Enter the element to append at last: ");
            int element = sc.nextInt();

            list.add(element); // adding element at the end
            System.out.println("List after adding " + element + " at the end: " + list);

        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
