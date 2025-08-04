//Write a Java program to sort a numeric array and a string array.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Problem1 {

    public static void sortNumericArray(int[] arr, int size) { // Method to sort array

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.print("Sorted Array: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("What do you want to sort?");
            System.out.println("1. Numeric Array");
            System.out.println("2. string Array");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the size of the array: ");
                    int size = sc.nextInt();

                    int[] numArray = new int[size];

                    System.out.println("Enter elements");
                    for (int i = 0; i < size; i++) {
                        System.out.print("Enter elements at " + i + "th index: ");
                        numArray[i] = sc.nextInt();
                    }

                    System.out.print("Original Array: ");
                    for (int x : numArray) {
                        System.out.print(x + " ");
                    }
                    System.out.println();
                    sortNumericArray(numArray, size);

                    break;

                case 2:
                    System.out.println("Enter the size of the array: ");
                    int size1 = sc.nextInt();
                    sc.nextLine();

                    String[] strArray = new String[size1];

                    System.out.println("Enter elements");
                    for (int i = 0; i < size1; i++) {
                        System.out.println("Enter elements at " + i + "th index: ");
                        strArray[i] = sc.nextLine();
                    }

                    System.out.print("Original Array: ");
                    for (String x : strArray) {
                        System.out.print(x + " ");
                    }
                    System.out.println();
                    break;

                default:
                    System.out.println("Invalid choice");

            }

        } catch (InputMismatchException e) {
            System.out.println(e);
        }
    }
}
