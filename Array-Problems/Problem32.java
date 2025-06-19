
//Write a Java program to find the number of even and odd integers in a given array of integers.
import java.util.InputMismatchException;
import java.util.Scanner;

public class Problem32 {

    public static void oddEvenCount(int[] array, int size) {
        int oddCount = 0, evenCount = 0;

        for (int x : array) {
            if (x % 2 == 0)
                evenCount++;
            else
                oddCount++;
        }
        System.out.print("The odd count in the array: " + oddCount + "\n");
        System.out.print("The even count in the array: " + evenCount);
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

            oddEvenCount(array, size);
        } catch (InputMismatchException e) {
            System.out.println("Enter valid input");
        } finally {
            sc.close();
        }
    }

}
