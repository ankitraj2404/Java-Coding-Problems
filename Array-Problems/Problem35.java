//Write a Java program to check if an array of integers is without 0 and -1.

import java.util.*;

public class Problem35 {
    public static void display(int[] array) {
        System.out.print("Original Array: ");
        for (int x : array) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void checkZeroAndNegative(int[] array, int size) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (array[i] == 0 || array[i] == -1) {
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Array elements neither include 0 nor -1");
        } else {
            System.out.println("Array elements include either 0 or -1");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the size of the array: ");
            int size = sc.nextInt();

            if (size <= 0) {
                System.out.println("Array size should be greater than 0.");
                return;
            }

            int[] array = new int[size];

            System.out.println("Enter elements of the array");
            for (int i = 0; i < size; i++) {
                System.out.print("Enter element at " + (i + 1) + " : ");
                array[i] = sc.nextInt();
            }
            display(array);
            checkZeroAndNegative(array, size);
        } catch (InputMismatchException e) {
            System.out.println("Enter valid input");
        } finally {
            sc.close();
        }
    }
}