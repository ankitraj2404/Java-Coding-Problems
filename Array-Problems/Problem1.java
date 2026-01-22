//Write a Java program to sort a numeric array and a string array.

import java.util.*;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your choice:\n" + "1.For Integer Array\n" + "2.For String Array");
        int choice = sc.nextInt();

        switch (choice) {
        case 1:
            System.out.println("Enter the size of the array: ");
            int size = sc.nextInt();
            int[] intArray = new int[size];
            System.out.println("Enter " + size + " elements: ");
            for (int i = 0; i < size; i++) {
                intArray[i] = sc.nextInt();
            }
            int[] sorted = Arrays.stream(intArray).sorted().toArray();
            System.out.println(Arrays.toString(sorted));

            break;

        case 2:
            System.out.println("Enter the size of the array: ");
            int strSize = sc.nextInt();
            String[] stringArray = new String[strSize];
            for (int i = 0; i < strSize; i++) {
                stringArray[i] = sc.nextLine();
            }
            break;

        default:
            System.out.println("Invalid choice");
            break;
        }
    }
}