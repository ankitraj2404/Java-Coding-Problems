//Write a Java program to remove every third element from an ArrayList using a loop and then display the final list.

import java.util.ArrayList;
import java.util.Scanner;

public class Problem26 {
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

            for (int i = 2; i < list.size(); i += 2) {
                list.remove(i); // removing every third element
            }

            System.out.println("List after removing every third element: " + list);

        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}