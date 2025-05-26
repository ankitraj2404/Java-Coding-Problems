
//program to find all pairs of elements in an array whose sum is equal to a specified number.
import java.util.*;

public class Problem27 {

    // Method to find the pair
    public void findPair(int[] arr, int key) {
        int size = arr.length;
        boolean found = false;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] + arr[j] == key) {
                    System.out.println("The pair whose sum is equal to " + key + " is: " + arr[i] + " " + arr[j]);
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("No pairs found with sum = " + key);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the size of the array: ");
            int size = sc.nextInt();

            System.out.println("Enter the key value: ");
            int key = sc.nextInt();

            // Declare and Initialize array
            int[] arr = new int[size];
            System.out.println("Enter the elements of the array: ");
            for (int i = 0; i < size; i++) {
                System.out.print("Enter element at " + (i + 1) + " :");
                arr[i] = sc.nextInt();
                System.out.println();
            }
            // Create the object of the class and then call the method
            Problem27 obj = new Problem27();
            obj.findPair(arr, key);
        } catch (InputMismatchException e) {
            System.out.println("Enter the valid input");
        } finally {
            sc.close();
        }
    }

}
