
//Program to search a element in the array of distinct elemnts
import java.util.*;

public class Problem2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter the size of the array: ");
            int size = sc.nextInt();

            int[] arr = new int[size];
            System.out.println();
            System.out.println("Enter the elements in the array(No duplicates): ");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.print("Array: ");
            for (int x : arr) {
                System.out.print(x + " ");
            }
            System.out.println();
            System.out.print("Enter the value to search: ");
            int key = sc.nextInt();
            boolean flag = false;
            System.out.println();
            for (int i = 0; i < size; i++) {
                if (arr[i] == key) {
                    System.out.print(key + " is present at " + (i + 1) + "th index inside the array.");
                    flag = true;
                }
            }
            System.out.println();
            if (!flag) {
                System.out.println(key + " is not there in the array.");
            }
            sc.close();
        } catch (InputMismatchException e) {
            System.out.println("Enter the valid inputs.");
        }
    }

}
