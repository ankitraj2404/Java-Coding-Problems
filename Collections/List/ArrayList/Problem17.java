//Write a Java program to update an array element by the given element.

import java.util.ArrayList;
import java.util.Scanner;

public class Problem17 {
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

            System.out.println("Enter the index you want to update: ");
            int index = sc.nextInt();

            System.out.println("Enter the element you want to update with at index " + index + " :");
            int element = sc.nextInt();

            if (index < 0 || index > size - 1) {
                System.out.println("please enter valid index");
            } else {
                list.set(index, element);
                System.out.println("Index " + index + " updated with " + element);
            }
            System.out.println("List after updation: " + list);
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
