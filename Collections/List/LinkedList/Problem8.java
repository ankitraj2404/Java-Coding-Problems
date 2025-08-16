//Write a Java program to traverse a linked list recursively and print its elements in order.

import java.util.LinkedList;
import java.util.List;

public class Problem8 {

    public static void traverse(List<Integer> list, int index) {

        if (index >= list.size()) {
            return;
        }
        System.out.print(list.get(index) + " ");
        traverse(list, index + 1);
    }

    public static void main(String[] args) {
        try {
            LinkedList<Integer> list = new LinkedList<>(List.of(1, 2, 3, 4, 5));
            traverse(list, 0);

        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
