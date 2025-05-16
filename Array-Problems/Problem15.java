/*
 * Program to calculate the result of the student on the below condition
 * Step 1: Take marks of 5 subjects
 * Step 2: Traverse through the array and check if the marks in any one subject
 * are below 50. Declare 'Fail'.
 */

import java.util.*;

public class Problem15 {

    // Method to calculate result
    public static void calculateResult(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 50) {
                System.out.println("!!!!!!!!!! FAIL !!!!!!!!!!");
                break;
            } else {
                System.out.println("******** PASS *********");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Declare array
            int[] arr = new int[5];

            // Take marks
            System.out.println("Enter the Marks: ");
            for (int i = 0; i < 5; i++) {
                arr[i] = sc.nextInt();
            }

            // Display the marks
            System.out.print("Marks: ");
            for (int x : arr) {
                System.out.print(x + " ");
            }
            System.out.println();
            calculateResult(arr);
        } catch (InputMismatchException e) {
            System.out.println();
        } finally {
            sc.close();
        }
    }
}