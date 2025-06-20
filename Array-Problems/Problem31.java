
// Write a java program to shift all zero at the end
import java.util.Scanner;
import java.util.InputMismatchException;

public class Problem31 {

    public static void display(int[] array) {
        System.out.print("Array: ");
        for (int x : array) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void shiftAllZero(int[] array, int size) {
        int nonZeroIndex = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] != 0) {
                array[nonZeroIndex++] = array[i];
            }
        }
        while (nonZeroIndex < size) {
            array[nonZeroIndex] = 0;
            nonZeroIndex++;
        }
        System.out.print("Array: ");
        for (int x : array) {
            System.out.print(x + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the size of the array: ");
            int size = sc.nextInt();

            int[] array = new int[size];

            System.out.println("Enter elements of the array");
            for (int i = 0; i < size; i++) {
                System.out.print("Enter element at " + (i + 1) + " : ");
                array[i] = sc.nextInt();
            }
            display(array);
            shiftAllZero(array, size);

        } catch (InputMismatchException e) {
            System.out.println("Enter valid input");
        } finally {
            sc.close();
        }
    }
}