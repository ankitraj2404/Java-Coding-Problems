//Write a Java program to find the maximum and minimum value of an array.

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

public class Problem34 {
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
            OptionalInt minimumValue = Arrays.stream(array).min();
            OptionalInt maximumValue = Arrays.stream(array).max();
            System.out.println("Minimum Value: " + minimumValue.getAsInt());
            System.out.println("Maximum Value: " + maximumValue.getAsInt());
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
