//Write a Java program to sort an array of strings based on their length in ascending order.

import java.util.Arrays;
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter the size of the array: ");
            int size = sc.nextInt();
            sc.nextLine();

            String[] array = new String[size];
            System.out.println("Enter elements: ");
            for (int i = 0; i < size; i++) {
                array[i] = sc.nextLine();
            }

            System.out.print("Original array: ");
            for (String s : array) {
                System.out.print(s + " ");
            }
            System.out.println();

            String[] sorted = Arrays.stream(array)
                    .sorted((a, b) -> Integer.compare(a.length(), b.length()))
                    .toArray(String[]::new);

            System.out.print("Sorted array: ");
            for (String s : sorted) {
                System.out.print(s + " ");
            }

        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
