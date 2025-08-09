//Write a Java program to retrieve an element (at a specified index) from a given array list.

import java.util.ArrayList;
import java.util.Scanner;

public class Problem16 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("How many elements do you want to enter?");
            int size = sc.nextInt();

            ArrayList<Integer> list = new ArrayList<>();

            System.out.println("Enter elements: ");
            for (int i = 0; i < size; i++) {
                int num = sc.nextInt();
                list.add(num);
            }
            System.out.println("Orgininal list: " + list);
            System.out.println("Enter the index between 0 to " + size + " you want to access: ");
            int index = sc.nextInt();

            if (index < 0 || index >= size) {
                System.out.println("Please enter valid index");
            } else {
                int element = list.get(index);
                System.out.println("The element at index " + index + " is: " + element);
            }

        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}