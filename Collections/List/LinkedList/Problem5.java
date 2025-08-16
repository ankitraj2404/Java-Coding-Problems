//Write a Java program to implement a method that appends an element at the end and then returns the updated size of the linked list.

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Problem5 {
    static Scanner sc = new Scanner(System.in);

    public static int addElement(List<Integer> list) {

        System.out.println("Enter element to add at the end: ");
        int element = sc.nextInt();

        list.add(element);
        System.out.println("Updated list: " + list);
        return list.size();

    }

    public static void main(String[] args) {
        try {
            LinkedList<Integer> list = new LinkedList<>(List.of(1, 2, 3, 4, 5));
            System.out.println("Original list: " + list);

            int size = addElement(list);
            System.out.println("Updated size of the list: " + size);
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
