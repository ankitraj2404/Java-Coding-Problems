
//Write a Java program to check if an array contains at least one negative number.
import java.util.Arrays;
import java.util.Scanner;

public class Problem19 {
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
            boolean hasNegative = Arrays.stream(array)
                    .anyMatch(i -> i < 0);

            String result = hasNegative ? "Array contains negative values" : "All elements are non-negative";
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
