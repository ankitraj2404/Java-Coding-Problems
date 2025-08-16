//Write a Java program to use an iterator to traverse a linked list starting at a given position and accumulate the elements into a new list.

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

class InvalidIndexException extends IndexOutOfBoundsException { // To handle invalid range exception

    public InvalidIndexException(String message) {
        super(message);
    }
}

public class Problem14 {

    public static void iterateList(LinkedList<Integer> list, int position) { // Method to iterate through list

        ListIterator<Integer> lt = list.listIterator(position);
        LinkedList<Integer> subPart = new LinkedList<>();
        while (lt.hasNext()) {
            subPart.add(lt.next());
        }
        System.out.println("Sub-List: " + subPart);
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
            System.out.println("Original list: " + list);
            System.out.println("Enter the specified position to start between 0 to " + (size - 1) + ": ");
            int position = sc.nextInt();
            if (position < 0 || position > size - 1) {
                throw new InvalidIndexException("Entered index is not in valid range.");
            }
            iterateList(list, position);

        } catch (InvalidIndexException e) {
            System.out.println(e.getMessage() + " " + e.getClass().getSimpleName());
        }
    }
}
