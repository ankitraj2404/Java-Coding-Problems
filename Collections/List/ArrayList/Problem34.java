//Write a Java program to sort an ArrayList of integers in descending order using a lambda expression.

import java.util.ArrayList;
import java.util.Scanner;

public class Problem34 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("How many elements do you want to have in the list?");
            int size = sc.nextInt();

            ArrayList<Integer> list = new ArrayList<>();
            System.out.println("Enter elements: ");
            for (int i = 0; i < size; i++) {
                list.add(sc.nextInt());
            }
            System.out.println("Original list: " + list);
            list.sort((a, b) -> b.compareTo(a));
            System.out.println("List after sorting in descending order: " + list);

        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
