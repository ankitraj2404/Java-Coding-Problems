
// Write a Java program to reverse only the even numbers in an array.
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Problem40 {
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

            int[] evenNumbers = Arrays.stream(array).filter(i -> i % 2 == 0).toArray();
            int[] evenNumbersIndex = IntStream.range(0, size).filter(i -> array[i] % 2 == 0).toArray();

            for (int i = 0, j = evenNumbers.length - 1; i < j; i++, j--) {
                int temp = evenNumbers[i];
                evenNumbers[i] = evenNumbers[j];
                evenNumbers[j] = temp;
            }
            for (int i = 0; i < evenNumbersIndex.length; i++) {
                int temp = evenNumbersIndex[i];
                array[temp] = evenNumbers[i];
            }
            System.out.println("Array after reversing the even numbers: " + Arrays.toString(array));
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
