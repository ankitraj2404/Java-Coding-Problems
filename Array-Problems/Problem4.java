// Program to rotate the array in either left or right direction

import java.util.*;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Read the size of the array
            System.out.println("Enter the size of the array: ");
            int size = sc.nextInt();

            // Declare array
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

            System.out.println("Enter 1 for Left rotation and 2 for Right rotation");
            int choice = sc.nextInt();

            switch (choice) {
                // Left rotation
                case 1:
                    int temp = arr[0];
                    for (int i = 0; i < size - 1; i++) {
                        arr[i] = arr[i + 1];
                    }
                    arr[size - 1] = temp;
                    System.out.print("After left rotation: ");
                    for (int x : arr) {
                        System.out.print(x + " ");
                    }
                    break;
                // Right rotation
                case 2:
                    int temp1 = arr[size - 1];
                    for (int i = size - 1; i > 0; i--) {
                        arr[i] = arr[i - 1];
                    }
                    arr[0] = temp1;
                    System.out.print("After right rotation: ");
                    for (int x : arr) {
                        System.out.print(x + " ");
                    }
                    break;

                default:
                    System.out.println("Please enter valid choice");
                    break;
            }

        } catch (InputMismatchException e) {
            System.out.println("Give valid input");
        }
        sc.close();
    }
}