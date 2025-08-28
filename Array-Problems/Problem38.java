//Write a Java program to find the difference between the maximum and minimum values in an array.

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

public class Problem38 {
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
            OptionalInt maximumOptionalInt = Arrays.stream(array).max();
            OptionalInt minimumOptionalInt = Arrays.stream(array).min();

            if (maximumOptionalInt.isPresent() && minimumOptionalInt.isPresent()) {
                int result = maximumOptionalInt.getAsInt() - minimumOptionalInt.getAsInt();
                System.out.println("Difference between maximum and minimum element: " + result);
            }
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
