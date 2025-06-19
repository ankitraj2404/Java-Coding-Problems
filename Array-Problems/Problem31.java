
// Write a java program to shift all zero at the end
import java.util.*;

public class Problem31 {
    public static void moveZeros(int[] array, int size) {
        int temp = 0, pos = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] != 0) {
                temp = array[i];
                array[i] = array[pos];
                array[pos] = temp;
                pos++;
            }
        }
        System.out.print("Array after shifting all zero at the end: ");
        for (int x : array) {
            System.out.print(x + " ");
        }
    }

    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the size of the array: ");
            int size = sc.nextInt();

            int[] array = new int[size];

            System.out.println("Enter elements of the array");
            for (int i = 0; i < size; i++) {
                System.out.print("Enter element at " + (i + 1) + " : ");
                array[i] = sc.nextInt();
                System.out.println();
            }

            // Original Array
            System.out.print("Original Array: ");
            for (int x : array) {
                System.out.print(x + " ");
            }
            System.out.println();

            moveZeros(array, size);
        } catch (InputMismatchException e) {
            System.out.println("Enter valid input");
        } finally {
            sc.close();
        }
    }

}