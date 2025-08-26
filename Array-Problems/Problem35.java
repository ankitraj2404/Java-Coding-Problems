//Write a Java program to find the second highest and second lowest values in an array.

import java.util.Arrays;
import java.util.Scanner;

public class Problem35 {
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

            int firstMax = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
            int firstMin = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;

            for (int num : array) {
                // max tracking
                if (num > firstMax) {
                    secondMax = firstMax;
                    firstMax = num;
                } else if (num > secondMax && num != firstMax) {
                    secondMax = num;
                }

                // min tracking
                if (num < firstMin) {
                    secondMin = firstMin;
                    firstMin = num;
                } else if (num < secondMin && num != firstMin) {
                    secondMin = num;
                }
            }

            if (secondMax != Integer.MIN_VALUE) {
                System.out.println("Second highest: " + secondMax);
            } else {
                System.out.println("No distinct second highest found");
            }

            if (secondMin != Integer.MAX_VALUE) {
                System.out.println("Second lowest: " + secondMin);
            } else {
                System.out.println("No distinct second lowest found");
            }
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
