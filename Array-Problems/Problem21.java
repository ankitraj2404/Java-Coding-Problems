//Program to find the second largest element in the intege array

import java.util.*;

public class Problem21 {

    public static void second_large(int[] arr) {
        int max1 = arr[0], max2 = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            } else {
                max2 = arr[i];
            }
        }
        System.out.println("The second largest element in the array: " + max2);
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

            second_large(arr);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
        } finally {
            sc.close();
        }
    }

}
