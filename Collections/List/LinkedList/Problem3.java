
//Write a Java program to append multiple elements from an array to the end of a linked list using a loop.
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            int[] array = new int[] { 1, 2, 3, 4, 5 };
            List<Integer> list = new LinkedList<>();

            for (int i = 0; i < array.length; i++) {
                list.add(array[i]);
            }
            System.out.println("Linked List after adding elements of the array: " + list);

        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
