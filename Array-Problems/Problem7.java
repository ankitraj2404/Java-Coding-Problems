//Program to Copying an array, reverse copying an array

import java.util.*;

public class Problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the size of the array: ");
            int size = sc.nextInt();

            // Declare an array
            int[] arr = new int[size];

            // Read the elements of the array
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

            System.out.println("Enter 1 for copying array and 2 for reverse copying");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    int[] newArr = new int[size];
                    // Copy array
                    for (int i = 0; i < size; i++) {
                        newArr[i] = arr[i];
                    }
                    // Print the array
                    System.out.print("New Array: ");
                    for (int x : newArr) {
                        System.out.print(x + " ");
                    }
                    System.out.println();
                    break;

                case 2:
                    int[] revArr = new int[size];
                    // Reverse the array
                    for (int i = size - 1, j = 0; i >= 0; i--, j++) {
                        revArr[j] = arr[i];

                    }
                    // Print the reversed array
                    System.out.print("Array after reversing: ");
                    for (int x : revArr) {
                        System.out.print(x + " ");
                    }
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;

            }
        } catch (InputMismatchException e) {
            System.out.println("Enter only valid inputs");
        } finally {
            sc.close();
        }
    }

}
