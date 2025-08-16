
//Write a Java program to iterate through a linked list starting from a user-defined index and print the remaining elements.
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Problem12 {

    public static void iterateList(LinkedList<Integer> list, int position) {

        Iterator<Integer> it = list.listIterator(position);
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of the linked list: ");
            int size = sc.nextInt();

            LinkedList<Integer> list = new LinkedList<>();
            System.out.println("Enter elements: ");
            for (int i = 0; i < size; i++) {
                list.add(sc.nextInt());
            }

            System.out.println("Enter the specified position to start between 0 to " + (size - 1) + ": ");
            int position = sc.nextInt();

            iterateList(list, position);

        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
