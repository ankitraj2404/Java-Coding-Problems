
//Program to increase the size of the array
import java.util.*;

public class Problem8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Take size of the array
            System.out.println("Enter the size of the array: ");
            int size = sc.nextInt();

            // Inittialize array
            int[] arr = new int[size];

            // Take elements of the array
            System.out.println("Enter the elements of the array: ");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            // Print the array
            System.out.print("Array: ");
            for (int x : arr) {
                System.out.print(x + " ");
            }
            System.out.println();

            // Declare new array with double size
            int newArr[] = new int[size * 2];

            // Copy old array into new array
            for (int i = 0; i < size; i++) {
                newArr[i] = arr[i];
            }

            // Reassign original refernce
            arr = newArr;

            // Display the new array with extra slots as 0
            System.out.print("Array after increasing size to " + arr.length + ": ");
            for (int x : arr) {
                System.out.print(x + " ");
            }
        } catch (InputMismatchException e) {
            System.out.println("Enter only valid inputs");
        } finally {
            sc.close();
        }
    }

}
