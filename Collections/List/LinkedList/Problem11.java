//Write a Java program to iterate through all elements in a linked list starting at the specified position.

import java.util.LinkedList;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Problem11 {

    public static void iterateList(LinkedList<Integer> list, int position) {
        IntStream.range(position, list.size())
                .forEach(i -> System.out.print(list.get(i) + " "));
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
