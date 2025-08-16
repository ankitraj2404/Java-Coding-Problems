//Write a Java program to skip a specified number of elements in a linked list and then print the rest using recursion.

import java.util.LinkedList;
import java.util.Scanner;

class InvalidIndexException extends IndexOutOfBoundsException {

    public InvalidIndexException(String message) {
        super(message);
    }
}

public class Problem13 {

    public static void iterateList(LinkedList<Integer> list, int position) {

        if (position >= list.size()) {
            return;
        }
        System.out.print(list.get(position) + " ");
        iterateList(list, position + 1);
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

            System.out.println("Enter count of numbers to skip between 0 to " + (size - 1) + ": ");
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
