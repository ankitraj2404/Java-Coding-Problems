
//Write a Java program to insert an element into a sorted array while maintaining the order.
import java.util.Arrays;
import java.util.Scanner;

public class Problem30 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of the array: ");
            int size = sc.nextInt();

            int[] array = new int[size];
            System.out.println("Enter elements: ");
            for (int i = 0; i < size; i++) {
                array[i] = sc.nextInt();
            }
            Arrays.sort(array);
            System.out.println("Original Array: " + Arrays.toString(array));
            System.out.println("Enter element to insert element: ");
            int element = sc.nextInt();
            int index = size;
            for (int i = 0; i < size; i++) {
                if (element <= array[i]) {
                    index = i;
                    break;
                }
            }
            int newSize = size + 1;
            int[] updatedArray = new int[newSize];

            System.arraycopy(array, 0, updatedArray, 0, index);
            updatedArray[index] = element;
            System.arraycopy(array, index, updatedArray, index + 1, size - index);

            System.out.println("Array after inserting " + element + " : " + Arrays.toString(updatedArray));
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
