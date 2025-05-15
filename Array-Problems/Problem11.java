//Program to sort the numeric and string array

import java.util.*;

public class Problem11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Which data-type array you want to sort, Enter 1 for String and 2 for Numeric: ");
            int choice = sc.nextInt();
            int repeat;
            do {
                switch (choice) {
                    case 1:
                        System.out.println("Enter the size of the array: ");
                        int size = sc.nextInt();
                        sc.nextLine();

                        // Declare and Initialize array
                        String[] arr = new String[size];

                        // Take String values
                        System.out.println("Enter string elements: ");
                        System.out.println();
                        for (int i = 0; i < size; i++) {
                            System.out.print("Element at " + i + " th index: ");
                            arr[i] = sc.nextLine();
                            System.out.println();
                        }
                        System.out.println();
                        // Display Original array
                        System.out.print("Array: ");
                        for (String x : arr) {
                            System.out.print(x + " ");
                        }
                        System.out.println();

                        // Sort the array
                        for (int i = 0; i < size; i++) {
                            for (int j = 0; j < size - i - 1; j++) {
                                if (arr[j].compareToIgnoreCase(arr[j + 1]) > 0) {
                                    String temp = arr[j];
                                    arr[j] = arr[j + 1];
                                    arr[j + 1] = temp;
                                }
                            }
                        }
                        // Array after sorting
                        System.out.print("Array after sorting: ");
                        for (String x : arr) {
                            System.out.print(x + " ");
                        }
                        break;

                    case 2:
                        System.out.println("Enter the size of the numeric array: ");
                        int num_size = sc.nextInt();

                        // Declare array
                        int[] newArr = new int[num_size];

                        // Take numeric elements
                        System.out.println("Enter the numeric elements: ");
                        for (int i = 0; i < num_size; i++) {
                            newArr[i] = sc.nextInt();
                        }

                        // Display Array
                        System.out.print("Array: ");
                        for (int x : newArr) {
                            System.out.print(x + " ");
                        }
                        System.out.println();

                        // Sorting of array
                        for (int i = 0; i < num_size; i++) {
                            for (int j = 0; j < num_size - i - 1; j++) {
                                if (newArr[j] > newArr[j + 1]) {
                                    int temp = newArr[j];
                                    newArr[j] = newArr[j + 1];
                                    newArr[j + 1] = temp;

                                }
                            }
                        }
                        // Array after sorting
                        System.out.print("Array after sorting: ");
                        for (int x : newArr) {
                            System.out.print(x + " ");
                        }
                        System.out.println();
                        break;

                    default:
                        System.out.println("Enter valid choice(Between 1 and 2)");
                        break;

                }
                System.out.println("Do you wish to continue?(If yes enter 1 if not enter 0)");
                repeat = sc.nextInt();
            } while (repeat != 0);
        } catch (InputMismatchException e) {
            System.out.println("Enter the valid inputs");
        } finally {
            sc.close();
        }
    }

}
