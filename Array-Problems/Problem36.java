//Write a Java program to find the largest and smallest element in an array without using sorting.

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

public class Problem36 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of the array: ");
            int size = sc.nextInt();

            int[] array = new int[size];
            System.out.println("Enter elements: ");
            for (int i = 0; i < size; i++) {
                array[i] = sc.nextInt();
            }
            System.out.println("Original Array: " + Arrays.toString(array));
            OptionalInt maxValue = Arrays.stream(array).max();
            OptionalInt minValue = Arrays.stream(array).min();

            if (maxValue.isPresent()) {
                System.out.println("Maximum element: " + maxValue.getAsInt());
            } else {
                System.out.println("No such element");
            }
            if (minValue.isPresent()) {
                System.out.println("Minimum element: " + minValue.getAsInt());
            } else {
                System.out.println("No such element");
            }
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
