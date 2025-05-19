//Program to find the duplicates in the String array

import java.util.*;

public class Problem20 {

    public static String[] find_duplicate(String[] arr) {
        int len = arr.length;
        boolean[] visited = new boolean[len];
        int k = 0;
        String result[] = new String[len];

        for (int i = 0; i < len; i++) {
            if (visited[i]) { // Check element is already visited or not
                continue;
            }
            int count = 1; // set the count = 0;

            for (int j = i + 1; j < len; j++) {
                if (arr[i].equalsIgnoreCase(arr[j])) {
                    visited[j] = true; // Set the visited element as true
                    count++;
                }
            }
            if (count > 1) {
                result[k++] = arr[i];
            }
        }

        String[] finalResult = new String[k];

        for (int i = 0; i < k; i++) {
            finalResult[i] = result[i];
        }
        return finalResult;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the size of the array: ");
            int size = sc.nextInt();
            sc.nextLine();

            // Declare and initialze array
            String[] arr = new String[size];

            for (int i = 0; i < size; i++) {
                System.out.print("Enter element at " + i + " index: ");
                arr[i] = sc.nextLine();
                System.out.println();
            }

            // Display array
            System.out.print("Original array: ");

            for (String x : arr) {
                System.out.print(x + " ");
            }
            System.out.println();

            // Call method and store result
            String duplicates[] = find_duplicate(arr);

            if (duplicates.length == 0) {
                System.out.println("No duplicates found");
            } else {
                System.out.println("=====================");
                System.out.println();
                System.out.print("Duplicates in the array: ");
                for (String x : duplicates) {
                    System.out.print(x + " ");
                }
            }
            System.out.println();

        } catch (InputMismatchException e) {
            System.out.println("Enter correct inputs");
        } finally {
            sc.close();
        }
    }

}
