//Write a Java program to remove all occurrences of a given value from an array.

import java.util.Arrays;
import java.util.Scanner;

public class Problem22 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter the size of the array: ");
            int size = sc.nextInt();

            int[] array = new int[size];
            System.out.println("Enter elements: ");
            for (int i = 0; i < size; i++) {
                array[i] = sc.nextInt();
            }

            System.out.println("Enter element to remove: ");
            int removeElement = sc.nextInt();
            int count = 0;
            for (int i = 0; i < size; i++) {
                if (array[i] != removeElement) {
                    count++;
                }
            }
            int updatedArray[] = new int[count];
            int j = 0;

            for (int i = 0; i < size; i++) {
                if (array[i] == removeElement) {
                    continue;
                }
                updatedArray[j++] = array[i];
            }
            System.out.println("Array after removing all occurences of " + removeElement + ": "
                    + Arrays.toString(updatedArray));
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
