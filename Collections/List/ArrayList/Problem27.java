
//Write a Java program to use Java streams to filter out the element at index two and collect the remaining elements into a new list.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Problem27 {
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
            int index = 2; // index value to be removed

            List<Integer> modifiedList = IntStream.range(0, size)
                    .filter(i -> i != index)
                    .mapToObj(list::get)
                    .collect(Collectors.toList());
            System.out.println("List after removal of second index element: " + modifiedList);

        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}