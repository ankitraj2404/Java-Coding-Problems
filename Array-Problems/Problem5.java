
//Program to insert an element in the array at specific position
import java.util.*;

public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Reading size of array
            System.out.println("Enter the size of the array: ");
            int size = sc.nextInt();

            System.out.println("Enter the elements of the array: ");
            int[] arr = new int[size];

            // Scanning elements of the array
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            // Displaying the array
            System.out.print("Array: ");
            for (int x : arr) {
                System.out.print(x + " ");
            }
            System.out.println();

            // Reading position and value of the element to be inserted in array
            System.out.println("Enter the element to insert in the array: ");
            int element = sc.nextInt();

            System.out.print("Enter the index value to insert " + element + " from 0 to " + size + ": ");
            int pos = sc.nextInt();

            if (pos < 0 || pos > (size - 1)) {
                System.out.println("Invalid position");
            }
            // Declaring new array with one extra size
            int[] newArr = new int[size + 1];

            for (int i = 0; i < pos; i++) {
                newArr[i] = arr[i];
            }
            newArr[pos] = element;
            for (int i = pos; i < size; i++) {
                newArr[i + 1] = arr[i];
            }
            // Displaying array after insertion
            System.out.println();
            System.out.print("Array after insertion: ");
            for (int x : newArr) {
                System.out.print(x + " ");
            }
        } catch (InputMismatchException e) {
            System.out.println("Give valid inputs");
        } finally {
            sc.close();
        }
    }
}