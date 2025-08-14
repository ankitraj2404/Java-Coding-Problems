
//Write a Java program to sum values of an array.
import java.util.Arrays;
import java.util.Scanner;

public class Problem6 {
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

            int sum = Arrays.stream(array)
                    .sum();

            System.out.println("The sum of all the elements: " + sum);

        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
