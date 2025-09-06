// Write a Java program to reverse a section of an array between two given indices.

import java.util.Arrays;
import java.util.Scanner;

public class Problem42 {
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

            System.out.println("Enter the range of index value to reverse between 0 and " + (size - 1) + ": ");
            int startingIndex = sc.nextInt();
            int endingIndex = sc.nextInt();

            if (startingIndex < 0 || endingIndex >= size) {
                return;
            }
            while (startingIndex < endingIndex) {
                int temp = array[startingIndex];
                array[startingIndex] = array[endingIndex];
                array[endingIndex] = temp;
                startingIndex++;
                endingIndex--;
            }
            System.out.println("Original Array: " + Arrays.toString(array));

        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
