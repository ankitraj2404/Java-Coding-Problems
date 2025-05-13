//Program to insert an element at specific position

import java.util.*;

public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Read the size of the array
            System.out.println("Enter the size of the array: ");
            int size = sc.nextInt();

            // Declare and read the elements of the array
            int[] arr = new int[size];
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

            // Read the element to be inserted and index value
            System.out.println("Enter the element to be inserted: ");
            int element = sc.nextInt();

            System.out.println("Enter the index value to be inserted (0 to " + size + ")");
            int index = sc.nextInt();

            if (index < 0 || index > size) {
                System.out.println("Invalid input");
                return;
            }

            // Declare new array with one extra size
            int[] newArr = new int[size + 1];

            for (int i = 0; i < index; i++) {
                newArr[i] = arr[i];
            }

            // Assign the value at the specific index
            newArr[index] = element;

            for (int i = index; i < size; i++) {
                newArr[i + 1] = arr[i];
            }

            // Display the array after insertion

            System.out.print("Array after insertion of " + element + " at " + index + " index value: ");
            for (int x : newArr) {
                System.out.print(x + " ");
            }

        } catch (InputMismatchException e) {
            System.out.println("Enter valid input");
        } finally {
            sc.close();
        }
    }
}