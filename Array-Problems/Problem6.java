//Program to delete an element from the specific index

import java.util.*;

public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the size of the array: ");
            int size = sc.nextInt();

            // Declare the array
            int[] arr = new int[size];

            // Initialize array
            System.out.println("Enter the elements of the array: ");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            // Display the array
            System.out.print("Array: ");
            for (int x : arr) {
                System.out.print(x + " ");
            }
            System.out.println();

            // Read the index value to delete the element
            System.out.println("Enter the index value (0 to " + (size - 1) + ")");
            int index = sc.nextInt();

            if (index < 0 || index >= size) {
                System.out.println("Invalid Index");
                return;
            }

            int newArr[] = new int[size - 1];

            // copying the left elements

            for (int i = 0; i < index; i++) {
                newArr[i] = arr[i];
            }
            for (int i = index; i < size - 1; i++) {
                newArr[i] = arr[i + 1];
            }

            // Display the array after deletion

            System.out.print("Array after deletion at index " + index + ": ");
            for (int x : newArr) {
                System.out.print(x + " ");
            }
        } catch (InputMismatchException e) {
            System.out.println("Enter only valid inputs");
        } finally {
            sc.close();
        }
    }

}
