//Program to find common elements in two integer array

import java.util.*;

public class Problem25 {

    public static void findCommon(int[] arr1, int[] arr2, int firstSize, int secondSize) {
        int k = 0;
        int[] result = new int[firstSize];
        for (int i = 0; i < firstSize; i++) {
            for (int j = 0; j < secondSize; j++) {
                if (arr1[i] == arr2[j]) {
                    boolean alreadyExist = false;
                    for (int x = 0; x < k; x++) { // Check if element already exist
                        if (result[x] == arr1[i]) {
                            alreadyExist = true;
                            break;
                        }
                    }
                    if (!alreadyExist) { // If not then add
                        result[k++] = arr1[i];
                    }
                    break;
                }
            }
        }
        if (k == 0) {
            System.out.println("No common elements found");
        } else {
            System.out.print("Common elements in both array: ");
            for (int i = 0; i < k; i++) {
                System.out.print(result[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the size of the first and second array: ");
            int firstSize = sc.nextInt();
            int secondSize = sc.nextInt();

            // Declare and initialize array
            int[] firstArray = new int[firstSize];
            int[] secondArray = new int[secondSize];

            System.out.println("Enter elements of the first array: ");
            for (int i = 0; i < firstSize; i++) {
                System.out.print("Enter element at " + i + " index: ");
                firstArray[i] = sc.nextInt();
            }
            System.out.println("-------------------------");
            System.out.println("Enter elements of the second array: ");
            for (int i = 0; i < secondSize; i++) {
                System.out.print("Enter element at " + i + " index: ");
                secondArray[i] = sc.nextInt();
            }

            // Display first array
            System.out.print("First array: ");
            for (int x : firstArray) {
                System.out.print(x + " ");
            }
            System.out.println();
            // Display seccond array
            System.out.print("Second array: ");
            for (int x : secondArray) {
                System.out.print(x + " ");
            }
            System.out.println();
            findCommon(firstArray, secondArray, firstSize, secondSize);
        } catch (InputMismatchException e) {
            System.out.println("Enter valid inputs");
        } finally {
            sc.close();
        }
    }

}
