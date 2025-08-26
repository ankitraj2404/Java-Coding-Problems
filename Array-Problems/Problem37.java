//Write a Java program to find the maximum and minimum sum of an array by excluding one element.

import java.util.Arrays;
import java.util.Scanner;

public class Problem37 {
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
            int totalSum = 0, min = array[0], max = array[0];
            for (int num : array) {
                totalSum += num;
                if (num > max)
                    max = num;

                if (num < min)
                    min = num;
            }

            int maximumSum = totalSum - min;
            int minimumSum = totalSum - max;

            System.out.println("Maximum sum after excluding one element: " + maximumSum);
            System.out.println("Miniimum sum after excluding one element: " + minimumSum);
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
