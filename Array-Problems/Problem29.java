//Write a Java program to insert an element (specific position) into an array.

import java.util.Arrays;
import java.util.Scanner;

public class Problem29 {
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
            System.out.println("Enter element and index value to insert element: ");
            int element = sc.nextInt();
            int index = sc.nextInt();

            int newSize = size + 1;
            int[] newArray = new int[newSize];

            for (int i = 0; i < index; i++) {
                newArray[i] = array[i];
            }
            newArray[index] = element;

            for (int i = index + 1; i < newSize; i++) {
                newArray[i] = array[i - 1];
            }

            System.out.println(
                    "Array after inserting " + element + " at index " + index + " : " +
                            Arrays.toString(newArray));
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
