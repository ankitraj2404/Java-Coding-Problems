//Program to find the average of the array elements

import java.util.*;

public class Problem12 {
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

            // Display the array
            System.out.print("Array: ");
            for (int x : arr) {
                System.out.print(x + " ");
            }
            System.out.println();

            // Sum of all the elements
            int sum = 0;
            for (int i = 0; i < size; i++) {
                sum += arr[i];
            }
            System.out.print("The sum of all the elements: " + sum);
            System.out.println();
            float average = (float) sum / arr.length;

            // Display the average
            System.out.print("The average of all the elements in the array is: " + average);
        } catch (InputMismatchException e) {
            System.out.println("Enter valid inputs");
        } finally {
            sc.close();
        }
    }

}
