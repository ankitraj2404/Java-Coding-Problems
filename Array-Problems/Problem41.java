//Write a Java program to reverse an array in-place without using an extra array.

import java.util.Arrays;
import java.util.Scanner;

public class Problem41 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of the array: ");
            int size = sc.nextInt();

            int[] array = new int[size];
            System.out.println("Enter elements: ");
            for (int i = 0; i < size; i++) {
                array[i] = sc.nextInt();
            }
            System.out.println("Original Array: " + Arrays.toString(array));

            int left = 0, right = size - 1;

            while(left < right){
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
                right--;
            }
            System.out.println("Array after reversing: " + Arrays.toString(array));
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
