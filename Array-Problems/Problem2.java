/*
 * Write a Java program to sort an array of integers in descending order without
 * using built-in sorting functions.
 */

import java.util.*;

public class Problem2 {
    public static void main(String[] args) {

        // give array
        int[] myArray = { 45, 12, 48, 98, 32 };
        int temp = 0;
        System.out.println("Original Array: " + Arrays.toString(myArray));
        for (int i = 0; i < myArray.length; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[i] < myArray[j]) {
                    temp = myArray[i];
                    myArray[i] = myArray[j];
                    myArray[j] = temp;
                }
            }
        }
        System.out.println("Array in descending order: " + Arrays.toString(myArray));

    }
}