//Write a Java program to remove the third element from an array list.

import java.util.ArrayList;
import java.util.Scanner;

public class Problem24 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("How many elements do you want to add?");
            int size = sc.nextInt();

            ArrayList<Integer> list = new ArrayList<>();

            System.out.println("Enter elements: ");
            for (int i = 0; i < size; i++) {
                list.add(sc.nextInt());
            }

            System.out.println("Original list: " + list);
            list.remove(2); // removing third element

            System.out.println("List after removing third element: " + list);
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
