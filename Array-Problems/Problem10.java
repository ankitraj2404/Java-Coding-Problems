import java.util.Arrays;
import java.util.Scanner;

public class Problem10 {

    public static int findSum(int[] array, int size) {
        if (size == array.length - 1) {
            return array[size];
        }

        return array[size] + findSum(array, size + 1);
    }

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
            int sum = findSum(array, 0);
            System.out.println("Sum of all the elements in the array: " + sum);
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
