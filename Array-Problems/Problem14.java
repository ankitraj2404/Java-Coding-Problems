
//Program to merge two given arrays into single one
import java.util.*;

public class Problem14 {

    // Method for merging two arrays
    public static void mergeArray(int[] arr1, int[] arr2) {
        int length = arr1.length + arr2.length;

        int[] newArray = new int[length];

        for (int i = 0; i < arr1.length; i++) {
            newArray[i] = arr1[i];
        }
        for (int i = arr1.length; i < length; i++) {
            newArray[i] = arr2[i - arr1.length];
        }
        // Display the merged array
        System.out.print("Array after merging: ");
        for (int x : newArray) {
            System.out.print(x + " ");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Take the size of the first array
            System.out.println("Enter the size of the first array: ");
            int size1 = sc.nextInt();

            System.out.println("Enter the size of the second array");
            int size2 = sc.nextInt();

            // Declare and initialize first array
            int[] firstarr = new int[size1];
            System.out.println("Enter elements for the first array");
            System.out.println();

            for (int i = 0; i < size1; i++) {
                System.out.print("Enter the element at " + i + "th index: ");
                firstarr[i] = sc.nextInt();
                System.out.println();
            }

            // Declare and initialize second array
            int[] secondarr = new int[size2];
            System.out.println("Enter elements for the second array: ");
            System.out.println();

            for (int i = 0; i < size2; i++) {
                System.out.print("Enter the element at " + i + "th index: ");
                secondarr[i] = sc.nextInt();
                System.out.println();
            }

            // Display first array
            System.out.print("First array: ");
            for (int x : firstarr) {
                System.out.print(x + " ");
            }
            System.out.println();
            System.out.println("--------------------------------");

            // Display second array
            System.out.print("Second array: ");
            for (int x : secondarr) {
                System.out.print(x + " ");
            }
            System.out.println();
            System.out.println("--------------------------------");

            mergeArray(firstarr, secondarr);
        } catch (InputMismatchException e) {
            System.out.println("Enter valid inputs");
        } finally {
            sc.close();
        }
    }
}