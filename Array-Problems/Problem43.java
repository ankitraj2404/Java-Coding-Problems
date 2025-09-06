//Write a Java program to reverse an array using recursion.

import java.util.Arrays;
import java.util.Scanner;

public class Problem43 {

    public static void reverseArray(int[] array, int startingIndex, int endingIndex) {
        // Base Case
        if (startingIndex >= endingIndex) {
            return;
        }
        int temp = array[startingIndex];
        array[startingIndex] = array[endingIndex];
        array[endingIndex] = temp;
        // recursive call
        reverseArray(array, startingIndex + 1, endingIndex - 1);
    }

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

            reverseArray(array, startingIndex, endingIndex);
            System.out.println("Reversed array: " + Arrays.toString(array));

        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
