//Program to find the frequency of each element in the array

import java.util.*;

public class Problem24 {

    public static void frequencyCount(int[] arr) {
        int len = arr.length;
        boolean[] visited = new boolean[len];

        for (int i = 0; i < len; i++) {
            int count = 1;
            if (visited[i]) { // Check that occurence is already visited or not
                continue;
            }
            for (int j = i + 1; j < len; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;// mark the index as already visited
                    count++;
                }
            }
            System.out.print("The frequency of " + arr[i] + " in the array is: " + count);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter the size of the array: ");
            int size = sc.nextInt();
            System.out.println();

            // Declare and initialize the array
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            // Display array
            System.out.print("Array: ");
            for (int x : arr) {
                System.out.print(x + " ");
            }
            System.out.println();

            frequencyCount(arr);
        } catch (InputMismatchException e) {
            System.out.println("Invalid inputs");
        } finally {
            sc.close();
        }
    }

}
