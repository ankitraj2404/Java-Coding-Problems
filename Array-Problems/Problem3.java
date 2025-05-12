//Program to find the first and second largest element in the array

import java.util.*;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the size of the array: ");
            int size = sc.nextInt();

            int[] arr = new int[size];
            System.out.println("Enter the elements of the array: ");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.print("Array: ");
            for (int x : arr) {
                System.out.print(x + " ");
            }
            System.out.println();
            int max1 = arr[0], max2 = arr[0];

            for (int i = 0; i < size; i++) {
                if (arr[i] > max1) {
                    max2 = max1;
                    max1 = arr[i];
                } else if (arr[i] > max2) {
                    max2 = arr[i];
                }
            }
            sc.close();
            System.out.println("The First Largest element in the array is: " + max1);
            System.out.println("The Second Largest element in the array is: " + max2);
        } catch (InputMismatchException e) {
            System.out.println("Enter valid inputs");
        }
    }

}
