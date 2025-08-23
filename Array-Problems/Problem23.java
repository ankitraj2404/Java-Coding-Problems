
//Write a Java program to remove every second element from an array.
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Problem23 {
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

            int[] updatedArray = IntStream.range(0, size).filter(i -> i % 2 == 0).map(i -> array[i]).toArray();

            System.out.println("Array after remeoving every second element: " + Arrays.toString(updatedArray));
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
