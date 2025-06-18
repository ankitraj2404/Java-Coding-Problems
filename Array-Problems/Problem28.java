
/* Write a Java program to test two arrays' equality. */

import java.util.Scanner;

public class Problem28 {
    public static void stringArray(String[] strArray1, String[] strArray2, int size) {// Method to compare two string
                                                                                      // array
        for (int i = 0; i < size; i++) {
            for (int j = i; j <= i; j++) {
                if (strArray1[i].equalsIgnoreCase(strArray2[j])) {
                    continue;
                } else {
                    System.out.println("String arrays are not equal");
                    return;
                }
            }
        }
        System.out.println("String arrays are equal");
    }

    public static void integerArray(int[] intArray1, int[] intArray2, int size1) {// Method to compare two integer array
        for (int i = 0; i < size1; i++) {
            if (intArray1[i] == intArray2[i]) {
                continue;
            } else {
                System.out.println("Integer arrays are not equal");
                return;
            }
        }
        System.out.println("Integer arrays are equal");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the data type of the array");
        System.out.println("1. Compare two String Array");
        System.out.println("2. Integer array");
        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter the size for the both string array: ");
                int size = sc.nextInt();
                sc.nextLine();

                String[] strArray1 = new String[size];
                String[] strArray2 = new String[size];

                System.out.println("Enter elements of the first string array");
                for (int i = 0; i < size; i++) {
                    System.out.print("Enter element at index " + i + ": ");
                    strArray1[i] = sc.nextLine();
                    System.out.println();
                }

                System.out.println("Enter elements of the second string array");
                for (int i = 0; i < size; i++) {
                    System.out.print("Enter element at index " + i + ": ");
                    strArray2[i] = sc.nextLine();
                    System.out.println();
                }
                stringArray(strArray1, strArray2, size);
                break;

            case 2:
                System.out.println("Enter the size of the integer array: ");
                int size1 = sc.nextInt();
                int[] intArray1 = new int[size1];
                int[] intArray2 = new int[size1];

                System.out.println("Enter elements of the first integer array");
                for (int i = 0; i < size1; i++) {
                    System.out.print("Enter element at index " + i + ": ");
                    intArray1[i] = sc.nextInt();
                    System.out.println();
                }

                System.out.println("Enter elements of the second integer array");
                for (int i = 0; i < size1; i++) {
                    System.out.print("Enter element at index " + i + ": ");
                    intArray2[i] = sc.nextInt();
                    System.out.println();
                }
                integerArray(intArray1, intArray2, size1);
                break;

            default:
                System.out.println("Invalid choice");
        }
        sc.close();
    }

}
