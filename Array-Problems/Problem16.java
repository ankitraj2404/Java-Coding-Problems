//Write a Java program to test if an array contains a specific value.

import java.util.Arrays;
import java.util.Scanner;

public class Problem16 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter the size of the array: ");
            int size = sc.nextInt();

            int[] array = new int[size];
            System.out.println("Enter elements: ");
            for (int i = 0; i < size; i++) {
                array[i] = sc.nextInt();
            }

            System.out.println("Original array: " + Arrays.toString(array));
            System.out.println("Enter the element to search: ");
            int searchedEelement = sc.nextInt();
            Arrays.sort(array);

            int left = 0, right = size - 1;
            boolean found = false;
            while (left <= right) { // Binary search
                int mid = (left + right) / 2;

                if (array[mid] == searchedEelement) {
                    found = true;
                    System.out.println("Element found at index: " + mid);
                    break;
                } else if (array[mid] < searchedEelement) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }

            }
            if (!found) {
                System.out.println("Element not found");
            }

        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}