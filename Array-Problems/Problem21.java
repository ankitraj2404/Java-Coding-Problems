//Program to find the second largest element in the integer array

import java.util.*;

public class Problem21 {

    public static void second_large(int[] arr) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2 && arr[i] != max1) {
                max2 = arr[i];
            }
        }
        if (max2 == Integer.MIN_VALUE) {
            System.out.println("No second largest element (all elements may be equal).");
        } else {
            System.out.println("The second largest element in the array: " + max2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the size of the array: ");
            int size = sc.nextInt();

            // Declare and Initialize array
            int[] arr = new int[size];

            for (int i = 0; i < size; i++) {
                System.out.print("Enter element at " + i + " index: ");
                arr[i] = sc.nextInt();
                System.out.println();
            }

            // Display array
            System.out.println("Original array: ");
            for (int x : arr) {
                System.out.print(x + " ");
            }
            System.out.println();

            second_large(arr);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
        } finally {
            sc.close();
        }
    }

}
