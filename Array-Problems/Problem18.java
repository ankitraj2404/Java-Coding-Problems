//Program to find the maximun and minimum of the element

import java.util.*;

public class Problem18 {

    public static void max_minArray(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        int len = arr.length;

        // Compare elements in the pair
        for (int i = 1; i < len; i = i + 2) {
            // at the end if no pair left
            if (i + 1 >= len) {
                if (arr[i] > max)
                    max = arr[i];
                if (arr[i] < min)
                    min = arr[i];
            } else {
                if (arr[i] > arr[i + 1]) {
                    if (arr[i] > max)
                        max = arr[i];
                    if (arr[i + 1] < min)
                        min = arr[i + 1];
                } else {
                    if (arr[i + 1] > max)
                        max = arr[i + 1];
                    if (arr[i] < min)
                        min = arr[i];
                }
            }
        }
        System.out.print("The maximum element in the array is: " + max);
        System.out.println();
        System.out.print("The minimum element in the array is: " + min);
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
            // Display the array
            for (int x : arr) {
                System.out.print(x + " ");
            }
            System.out.println();
            max_minArray(arr);

        } catch (InputMismatchException e) {
            System.out.println("Enter valid input");
        } finally {
            sc.close();
        }
    }

}
