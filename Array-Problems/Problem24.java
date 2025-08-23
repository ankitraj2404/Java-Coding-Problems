//Write a Java program to remove elements that are greater than a specified threshold.

import java.util.Arrays;
import java.util.Scanner;

public class Problem24 {
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
            System.out.println("Enter the threshold value: ");
            int threshold = sc.nextInt();

            int[] updatedArray = Arrays.stream(array).filter(i -> i > threshold).toArray();
            System.out.println("Array with elements less than " + threshold + " : " + Arrays.toString(updatedArray));
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
