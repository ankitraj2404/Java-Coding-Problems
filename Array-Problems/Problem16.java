//Program to get cyclic rotated array for 'N' number of times

import java.util.*;

public class Problem16 {

    // Method to perform rotation
    public static void cyclicRotation(int[] arr, int times) {
        int count = 1;
        int len = arr.length;
        while (count <= times) {
            int temp = arr[len - 1];
            for (int i = len - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = temp;
            System.out.print("Array after " + count + " rotation: ");
            for (int x : arr) {
                System.out.print(x + " ");
            }
            System.out.println();
            count++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Take the size of the array
            System.out.println("Enter the size of the array: ");
            int size = sc.nextInt();

            // Declare and initialize array
            int[] arr = new int[size];
            System.out.println("Enter the elements of the array: ");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            // Display array
            System.out.print("Array: ");
            for (int x : arr) {
                System.out.print(x + " ");
            }
            System.out.println();

            System.out.println("How many times you want to perform rotation please enter: ");
            int times = sc.nextInt();

            // Method call
            cyclicRotation(arr, times);
        } catch (InputMismatchException e) {
            System.out.println("Enter valid inputs");
        } finally {
            sc.close();
        }

    }
}