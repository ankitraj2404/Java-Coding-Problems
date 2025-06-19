
/* Write a Java program to find the one missing number in a sequence of natural numbers from 1 to N, 
where the numbers are stored in an array with exactly one number missing. */
import java.util.*;

public class Problem29 {

    public static int findMissingNumber(int[] array, int n) {
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int i = 0; i < array.length; i++) {
            actualSum += array[i];
        }
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter the last number of the sequence (N): ");
            int n = sc.nextInt();

            int[] array = new int[n - 1];
            System.out.println("Enter " + (n - 1) + " numbers (from 1 to " + n + ") with one missing:");
            for (int i = 0; i < array.length; i++) {
                System.out.print("Element " + i + ": ");
                array[i] = sc.nextInt();
            }

            System.out.print("Array: ");
            for (int x : array) {
                System.out.print(x + " ");
            }

            int missingNumber = findMissingNumber(array, n);
            System.out.println("\nThe missing number in the given array is: " + missingNumber);
        } catch (InputMismatchException e) {
            System.out.println("Enter only valid integers. " + e);
        } finally {
            sc.close();
        }
    }
}
