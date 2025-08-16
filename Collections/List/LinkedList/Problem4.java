//Write a Java program to append an element to the end of a linked list using recursion.

import java.util.LinkedList;
import java.util.Scanner;

public class Problem4 {

    static Scanner sc = new Scanner(System.in);

    public static LinkedList<Integer> addElement(LinkedList<Integer> list, int size) {
        if (list.size() >= size) {
            return list;
        }

        System.out.print("Enter elements: ");
        int element = sc.nextInt();
        list.add(element);

        return addElement(list, size);

    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            LinkedList<Integer> list = new LinkedList<>();

            System.out.println("Enter the size of the list: ");
            int size = sc.nextInt();
            list = addElement(list, size);
            System.out.println("Final List: " + list);

        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
