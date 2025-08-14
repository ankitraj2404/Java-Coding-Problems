//Write a Java program to calculate the average value of array elements.

import java.util.Arrays;
import java.util.Scanner;

public class Problem11 {
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

            double average = Arrays.stream(array)
                    .sum() / (double) array.length;
            System.out.println("Average: " + average);

        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
