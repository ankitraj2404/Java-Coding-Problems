//Program to find the second smallest element in the array

import java.util.*;

public class Problem22 {

    public static void second_smallest(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Array must contain at least two elements.");
            return;
        }

        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min1) {
                min2 = min1;
                min1 = arr[i];
            } else if (arr[i] < min2 && arr[i] != min1) {
                min2 = arr[i];
            }
        }

        if (min2 == Integer.MAX_VALUE) {
            System.out.println("No second smallest element (all elements may be equal).");
        } else {
            System.out.println("The second smallest element in the array: " + min2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the size of the array: ");
            int size = sc.nextInt();

            // Declare and initialize array
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                System.out.print("Enter element at " + i + " index: ");
                arr[i] = sc.nextInt();
            }

            // Display array
            System.out.print("Array: ");
            for (int x : arr) {
                System.out.print(x + " ");
            }
            second_smallest(arr);
        } catch (InputMismatchException e) {
            System.out.println("Invalid inputs");
        } finally {
            sc.close();
        }
    }

}
