//Write a Java program to search for an element and return its index, or -1 if not found, using a custom loop.

import java.util.ArrayList;
import java.util.Scanner;

public class Problem31 {

    public static int searchElement(ArrayList<String> list, int size, String search) { // method to find element
        for (int i = 0; i < size; i++) {
            if (list.get(i).equals(search))
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("How many elements do you want to have?");
            int size = sc.nextInt();
            sc.nextLine();

            ArrayList<String> list = new ArrayList<>();
            System.out.println("Enter elements: ");
            for (int i = 0; i < size; i++) {
                list.add(sc.nextLine());
            }
            System.out.println("Original list: " + list);
            System.out.println("Enter the element you want to search: ");
            String search = sc.nextLine();
            int result = searchElement(list, size, search);
            if (result > 0) {
                System.out.println("Element found at index: " + result);
            } else {
                System.out.println("Element not found");
            }
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
