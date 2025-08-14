//Write a Java program to calculate the weighted average of numbers in an array.

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Problem13 {
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

            System.out.println("Enter the corresponding weight: ");
            int[] weight = new int[size];
            for (int i = 0; i < size; i++) {
                weight[i] = sc.nextInt();
            }

            double weightSum = 0;
            double totalWeight = 0;

            for (int i = 0; i < size; i++) {
                weightSum += array[i] * weight[i];
                totalWeight += weight[i];
            }

            double weightedAverage = weightSum / totalWeight;
            System.out.println("Weighted Average: " + weightedAverage);

            double average = IntStream.range(0, size) // Weighted average using streams
                    .mapToDouble(i -> array[i] * weight[i])
                    .sum() /
                    IntStream.range(0, size)
                            .mapToDouble(i -> weight[i])
                            .sum();
            System.out.println("Weighted Average using streams: " + average);

        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
