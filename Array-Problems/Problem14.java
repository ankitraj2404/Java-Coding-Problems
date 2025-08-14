//Write a Java program to compute the average of elements greater than a specified threshold.

import java.util.Arrays;
import java.util.Scanner;

public class Problem14 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of the array: ");
            int size = sc.nextInt();

            int[] array = new int[size];

            System.out.println("Enter elements: ");
            for (int i = 0; i < size; i++) {
                array[i] = sc.nextInt();
            }
            System.out.println("Original array: " + Arrays.toString(array));

            System.out.println("Enter the threshold value: ");
            int threshold = sc.nextInt();

            int count = (int) Arrays.stream(array)
                    .filter(i -> i > threshold)
                    .count();

            double average = Arrays.stream(array)
                    .filter(i -> i > threshold)
                    .sum() / (double) count;

            System.out.println("Average of elements greater than threshold value: " + average);
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
