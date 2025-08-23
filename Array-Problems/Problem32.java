//Write a Java program to insert an element at the beginning of an array without using built-in methods.

import java.util.Arrays;
import java.util.Scanner;

public class Problem32 {
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

            System.out.print("Enter the element to insert in the beginning: ");
            int element = sc.nextInt();
            int[] updatedArray = new int[size + 1];
            updatedArray[0] = element;
            for (int i = 0; i < size; i++) {
                updatedArray[i + 1] = array[i];
            }

            System.out.println(
                    "Array after adding " + element + " at the beginning index: " + Arrays.toString(updatedArray));
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
