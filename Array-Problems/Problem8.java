
//Write a Java program to find the sum of all even and odd numbers separately in an integer array.
import java.util.Arrays;
import java.util.Scanner;

public class Problem8 {
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
            int evenSum = 0, oddSum = 0;

            for (int i = 0; i < size; i++) {
                if (array[i] % 2 == 0) {
                    evenSum += array[i];
                } else {
                    oddSum += array[i];
                }
            }

            System.out.println((evenSum != 0) ? "Sum of even numbers: " + evenSum : "Even numbers are not there");
            System.out.println((oddSum != 0) ? "Sum of odd numbers: " + oddSum : "Odd numbers are not there");

        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
