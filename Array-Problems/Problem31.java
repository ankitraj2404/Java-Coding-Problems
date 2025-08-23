//Write a Java program to insert multiple elements at specific positions in an array.
import java.util.Arrays;
import java.util.Scanner;

public class Problem31 {
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
            System.out.println("How many elements do you want to enter and at which index?");
            System.out.print("Enter no of elements: ");
            int count = sc.nextInt();
            System.out.print("Enter index value: ");
            int index = sc.nextInt();

            int[] elementsArray = new int[count];

            for (int i = 0; i < count; i++) {
                System.out.print("Enter " + i + " element: ");
                elementsArray[i] = sc.nextInt();
            }
            int[] updatedArray = new int[size + count];

            System.arraycopy(array, 0, updatedArray, 0, index);
            System.arraycopy(elementsArray, 0, updatedArray, index, count);
            System.arraycopy(array, index, updatedArray, index + count, size - index);

            System.out.println(
                    "Array after insertion of " + Arrays.toString(elementsArray) + " elements at index " + index + " : "
                            + Arrays.toString(updatedArray));
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
