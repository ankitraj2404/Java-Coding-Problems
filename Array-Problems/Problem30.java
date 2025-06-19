/* Write a Java program to find common elements in three sorted (in non-decreasing order) arrays. */

import java.util.Scanner;

public class Problem30 {

    public static void display(int[] array) {
        System.out.print("Array: ");
        for (int x : array) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void findCommonElements(int[] array1, int[] array2, int[] array3, int size) {
        int i = 0, j = 0, k = 0;
        boolean found = false;

        System.out.print("Common elements are: ");
        while (i < size && j < size && k < size) {
            if (array1[i] == array2[j] && array2[j] == array3[k]) {
                System.out.print(array1[i] + " ");
                i++;
                j++;
                k++;
                found = true;
            } else {
                int min = Math.min(array1[i], Math.min(array2[j], array3[k]));
                if (array1[i] == min)
                    i++;
                if (array2[j] == min)
                    j++;
                if (array3[k] == min)
                    k++;
            }
        }
        if (!found) {
            System.out.println("No common elements found");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter size of all three array: ");
            int size = sc.nextInt();

            int[] array1 = new int[size];
            int[] array2 = new int[size];
            int[] array3 = new int[size];

            System.out.println("Enter the elements of the first array(in non-descending form)");
            for (int i = 0; i < size; i++) {
                System.out.print("Enter element at " + (1 + i) + " index: ");
                array1[i] = sc.nextInt();
                System.out.println();
            }

            System.out.println("Enter the elements of the second array(in non-descending form)");
            for (int i = 0; i < size; i++) {
                System.out.print("Enter element at " + (1 + i) + " index: ");
                array2[i] = sc.nextInt();
                System.out.println();
            }

            System.out.println("Enter the elements of the third array(in non-descending form)");
            for (int i = 0; i < size; i++) {
                System.out.print("Enter element at " + (1 + i) + " index: ");
                array3[i] = sc.nextInt();
                System.out.println();
            }

            display(array1);
            display(array2);
            display(array3);

            findCommonElements(array1, array2, array3, size);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            sc.close();
        }
    }

}
