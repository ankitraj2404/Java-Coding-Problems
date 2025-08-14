
//Write a Java program to find the sum of alternate elements in an array.
import java.util.Arrays;
import java.util.Scanner;

public class Problem7 {
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
            int sum = 0;

            for (int i = 0; i < size; i += 2) {
                sum += array[i];
            }
            System.out.println("The sum of the alternate elements in the array: " + sum);

        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
