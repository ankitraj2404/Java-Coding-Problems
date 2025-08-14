
//Write a Java program to find the sum of digits of each element in an array.
import java.util.Arrays;
import java.util.Scanner;

public class Problem9 {
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
            int digit = 0;
            for (int i = 0; i < size; i++) {
                int num = array[i];
                int sum = 0;
                while (num != 0) {
                    digit = num % 10;
                    sum += digit;
                    num = num / 10;
                }
                System.out.println("The sum of the digits of " + array[i] + " is: " + sum);
            }

            // Stream approach
            Arrays.stream(array)
                    .forEach(num -> {
                        int sum = String.valueOf(Math.abs(num))
                                .chars()
                                .map(c -> c - '0')
                                .sum();
                        System.out.println("Using stream the sum of the digits of " + num + " is: " + sum);

                    });

        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
