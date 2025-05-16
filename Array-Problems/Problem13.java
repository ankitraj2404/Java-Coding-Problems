//Program to split one large size array into two small sized arrays

import java.util.*;

public class Problem13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the size of the array: ");
            int size = sc.nextInt();

            // Declare array
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
            // Declare two new array
            int mid = size / 2;
            int[] firstHalf = new int[mid];
            int[] secondHalf = new int[size - mid];

            // Initialize values into first array
            for (int i = 0; i < mid; i++) {
                firstHalf[i] = arr[i];
            }
            // Initialize values into second array
            for (int i = mid; i < size; i++) {
                secondHalf[i - mid] = arr[i];
            }
            // Display first half array
            System.out.println();
            System.out.print("First Half: ");
            for (int x : firstHalf) {
                System.out.print(x + " ");
            }
            // Display second half array
            System.out.println();
            System.out.print("Second Half: ");
            for (int x : secondHalf) {
                System.out.print(x + " ");
            }

        } catch (InputMismatchException e) {
            System.out.println("Enter only valid values");
        } finally {
            sc.close();
        }
    }
}