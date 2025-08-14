//Write a Java program to sort an array of integers in descending order without using built-in sorting functions.

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter the size of the array: ");
            int size = sc.nextInt();

            System.out.println("Enter elements: ");
            int[] array = new int[size];
            for (int i = 0; i < size; i++) {
                array[i] = sc.nextInt();
            }

            System.out.print("Original array: ");
            for (int x : array) {
                System.out.print(x + " ");
            }

            for (int i = 0; i < size; i++) {
                int maxIndex = i;
                for (int j = i + 1; j < size; j++) {
                    if (array[j] > array[maxIndex]) {
                        maxIndex = j;
                    }
                }
                int swap = array[i];
                array[i] = array[maxIndex];
                array[maxIndex] = swap;

            }
            System.out.print("Array after sorting in descending order: ");
            for (int x : array) {
                System.out.print(x + " ");
            }
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
