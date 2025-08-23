//Write a Java program to copy alternate elements from one array to another.

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Problem28 {

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

            int[] evenElements = IntStream.range(0, size).filter(i -> i % 2 == 0).map(i -> array[i]).toArray();
            String result = evenElements.length == 0 ? "No even Numbers found" : "Array with even numbers: ";
            System.out.println(result + Arrays.toString(evenElements));
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
