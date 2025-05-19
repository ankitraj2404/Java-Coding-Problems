//Program to find the duplicates in the array

import java.util.*;

public class Problem19 {

    public static int[] duplicates(int[] arr) {
        int len = arr.length;
        boolean[] visited = new boolean[arr.length];
        int k = 0;
        int[] result = new int[len];

        for (int i = 0; i < len; i++) {
            if (visited[i]) { // Check whether the element is already visited or not
                continue;
            }
            int count = 1; // Set count 1
            for (int j = i + 1; j < len; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true; // Set element as visited
                    count++;
                }
            }
            if (count > 1) {
                result[k++] = arr[i];
            }
        }
        int[] finalDuplicates = new int[k];

        for (int i = 0; i < k; i++) {
            finalDuplicates[i] = result[i];
        }

        return finalDuplicates;

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
            System.out.print("Array: ");
            for (int x : arr) {
                System.out.print(x + " ");
            }
            System.out.println();

            int[] duplicates_element = duplicates(arr);

            if (duplicates_element.length == 0) {
                System.out.println("No duplicates found");
            } else {
                System.out.print("Duplicates element: ");
                for (int x : duplicates_element) {
                    System.out.print(x + " ");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Enter valid inputs");
        } finally {
            sc.close();
        }
    }
}