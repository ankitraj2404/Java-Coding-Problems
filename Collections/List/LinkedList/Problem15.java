//Write a Java program to convert a linked list to an array and iterate from a specified position using stream slicing.

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Problem15 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of the linked list: ");
            int size = sc.nextInt();

            LinkedList<Integer> list = new LinkedList<>();
            System.out.println("Enter elements: ");
            for (int i = 0; i < size; i++) {
                list.add(sc.nextInt());
            }
            System.out.println("Original list: " + list);

            int[] array = new int[list.size()];

            array = list.stream()
                    .mapToInt(Integer::intValue)
                    .toArray();

            System.out.println("Array: " + Arrays.toString(array));
            System.out.println("Enter the starting and ending index: ");
            int startingIndex = sc.nextInt();
            int endingIndex = sc.nextInt();

            Arrays.stream(array)
                    .skip(startingIndex)
                    .limit(endingIndex - startingIndex + 1)
                    .forEach(i -> System.out.print(i + " "));

        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
