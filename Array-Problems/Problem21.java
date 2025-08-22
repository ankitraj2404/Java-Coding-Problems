//Write a Java program to remove a specific element from an array.

import java.util.Arrays;
import java.util.Scanner;

public class Problem21 {
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
            boolean remove = false;
            int[] updatedArray = new int[size - 1];
            int j = 0;
            for (int i = 0; i < size; i++) {
                if (!remove && array[i] == removeElement) {
                    continue;
                }
                if (j < size - 1) {
                    updatedArray[j++] = array[i];
                }
            }
            System.out.println("Updated: " + Arrays.toString(updatedArray));
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
