
//Write a Java program to sort an array of floating-point numbers using the selection sort algorithm.
import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter the size of the array: ");
            int size = sc.nextInt();

            float[] array = new float[size];
            System.out.println("Enter elements: ");
            for (int i = 0; i < size; i++) {
                array[i] = sc.nextFloat();
            }
            System.out.print("Original array: ");
            for (float s : array) {
                System.out.print(s + " ");
            }
            System.out.println();

            for (int i = 0; i < size - 1; i++) {
                int minIndex = i;
                for (int j = i + 1; j < size; j++) {
                    if (array[j] < array[minIndex]) {
                        minIndex = j;
                    }
                }
                if (minIndex != i) {
                    float swap = array[i];
                    array[i] = array[minIndex];
                    array[minIndex] = swap;
                }
            }

            System.out.print("Array after sorting: ");
            for (float x : array) {
                System.out.print(x + " ");
            }

        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
