// Prpgram to find the sum of all of the elements in the array

import java.util.*;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the size of the array: ");
            int size = sc.nextInt();

            int arr[] = new int[size];

            System.out.println("Enter the elements of the array: ");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.print("Array: ");
            for (int x : arr) {
                System.out.print(x + " ");
            }

            int sum = 0;
            System.out.println();

            System.out.print("The sum of the elements of the array is: ");
            for (int x : arr) {
                sum += x;
            }

            System.out.print(sum);

            sc.close();
        } catch (InputMismatchException e) {
            System.out.println("Enter valid size for the array");
        }
    }
}
