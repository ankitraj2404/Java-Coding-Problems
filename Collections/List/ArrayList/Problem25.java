//Write a Java program to remove the third element and handle cases where the list has fewer than three elements using exception handling.

import java.util.ArrayList;
import java.util.Scanner;

public class Problem25 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("How many elements do you want in the list: ");
            int size = sc.nextInt();

            ArrayList<Integer> list = new ArrayList<>();

            System.out.println("Enter elements: ");
            for (int i = 0; i < size; i++) {
                list.add(sc.nextInt());
            }

            System.out.println("Original list: " + list);
            list.remove(2);

            System.out.println("Updated list after removing thirs index element: " + list);

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Third index is not available " + e.getClass().getSimpleName());
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }

}