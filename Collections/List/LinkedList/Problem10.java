//Write a Java program to iterate through a linked list and collect its elements into an array for further processing.

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of the linked list: ");
            int size = sc.nextInt();

            LinkedList<Integer> list = new LinkedList<>();
            System.out.println("Enter elements: ");
            for (int i = 0; i < size; i++) {
                list.add(sc.nextInt());
            }

            int[] array = new int[list.size()];

            for (int i = 0; i < size; i++) {
                array[i] = list.get(i);
            }
            System.out.println("Array: " + Arrays.toString(array));

        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
