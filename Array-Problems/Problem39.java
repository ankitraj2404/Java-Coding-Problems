//Write a Java program to reverse an array of integer values.

import java.util.Arrays;
import java.util.Scanner;

public class Problem39 {
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

            for (int i = 0, j = size - 1; i < j; i++, j--) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
            System.out.println("Array after reversing: " + Arrays.toString(array));
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
