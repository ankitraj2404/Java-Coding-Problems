
//Write a Java program to copy all non-zero elements from an array into a new array.
import java.util.Arrays;
import java.util.Scanner;

public class Problem27 {
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
            int[] nonZeroElements = Arrays.stream(array).filter(i -> i != 0).toArray();
            String result = nonZeroElements.length == 0 ? "All elements are zero " : "Array with non zero elements: ";
            System.out.println(result + Arrays.toString(nonZeroElements));
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
