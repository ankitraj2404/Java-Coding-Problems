//Program to find the common elements in two string arrays

import java.util.*;

public class Problem23 {

    public static void commonElements(String[] arr, String[] arr1, int first, int second) {
        String[] result = new String[first];
        int k = 0;

        for (int i = 0; i < first; i++) {
            for (int j = 0; j < second; j++) {

                if (arr[i].equalsIgnoreCase(arr1[j])) {
                    boolean alreadyExist = false;
                    for (int x = 0; x < k; x++) {
                        if (result[x].equalsIgnoreCase(arr[i])) {
                            alreadyExist = true;
                            break;
                        }
                    }
                    if (!alreadyExist) {
                        result[k++] = arr[i];
                    }
                    break;
                }

            }
        }
        if (k == 0) {
            System.out.println("No Common elements");
        } else {
            System.out.print("Common elements: ");
            for (int i = 0; i < k; i++) {
                System.out.print(result[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the size of the first and second array: ");
            int first = sc.nextInt();
            int second = sc.nextInt();
            sc.nextLine();

            // Declare and initialize both array
            String[] firstArray = new String[first];
            String[] secondArray = new String[second];

            for (int i = 0; i < first; i++) { // Take input for the first array
                System.out.print("Enter element at " + i + " index: ");
                firstArray[i] = sc.nextLine();
            }
            System.out.println();

            for (int i = 0; i < second; i++) { // Take input for the second array
                System.out.print("Enter element at " + i + " index: ");
                secondArray[i] = sc.nextLine();
            }
            System.out.println();

            // Display both array
            System.out.print("First Array: ");
            for (String x : firstArray) {
                System.out.print(x + " ");
            }
            System.out.println();

            System.out.print("Second Array: ");
            for (String x : secondArray) {
                System.out.print(x + " ");
            }
            System.out.println();

            commonElements(firstArray, secondArray, first, second);

        } catch (InputMismatchException e) {
            System.out.println("Enter valid inputs");
        } finally {
            sc.close();
        }
    }

}
