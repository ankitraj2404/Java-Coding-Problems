//Write a Java program to search for multiple occurrences of an element in an ArrayList and print all indices where it appears.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Problem32 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("How many elements do you want?");
            int size = sc.nextInt();

            ArrayList<Integer> list = new ArrayList<>();
            System.out.println("Enter elements: ");
            for (int i = 0; i < size; i++) {
                list.add(sc.nextInt());
            }
            System.out.println("Original list: " + list);
            System.out.println("Enter the element you want to search: ");
            int search = sc.nextInt();

            List<Integer> elementPresent = IntStream.range(0, size)
                    .filter(i -> list.get(i).equals(search))
                    .boxed()
                    .collect(Collectors.toList());

            if (!elementPresent.isEmpty()) {
                System.out.println("Element found at indexes: " + elementPresent);
            } else {
                System.out.println("Element not found");
            }
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
