// Write a Java program to calculate the moving average of a given list of numbers.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Problem15 {
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
            System.out.println("Enter the moving value: ");
            int value = sc.nextInt();

            ArrayList<Double> list = new ArrayList<>();

            for (int i = 0; i <= size - value; i++) {
                int sum = 0;
                for (int j = i; j < i + value; j++) {
                    sum += array[j];
                }
                list.add(sum / (double) value);
            }

            System.out.println("Moving average: " + list);

        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
