//Write a Java program to insert elements from another array at alternate positions.

import java.util.Arrays;
import java.util.Scanner;

public class Problem33 {
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

            int[] arr = { 1, 2, 3, 4 };
            int[] updatedArray = new int[size + arr.length];
            int i = 0, j = 0, k = 0;

            while (j < size && k < arr.length) {
                updatedArray[i++] = array[j++];
                updatedArray[i++] = arr[k++];
            }
            while (j < size) {
                updatedArray[i++] = array[j++];
            }
            while (k < arr.length) {
                updatedArray[i++] = arr[k++];
            }
            Arrays.stream(updatedArray).forEach(e -> System.out.print(e + " "));
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
