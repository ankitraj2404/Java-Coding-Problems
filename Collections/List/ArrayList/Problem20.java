//Write a Java program to join two array lists.

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Problem20 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of the first array: ");
            int size = sc.nextInt();
            sc.nextLine(); // Consume left over line

            // Declare First ArrayList
            ArrayList<String> firstArrayList = new ArrayList<>();

            System.out.println("Enter elements in first array list");
            for (int i = 0; i < size; i++) {
                firstArrayList.add(sc.nextLine());
            }

            System.out.println("Enter the size of the second array: ");
            int size2 = sc.nextInt();
            sc.nextLine(); // consume left over line

            // Declare arraylist 2
            ArrayList<String> secondArrayList = new ArrayList<>();

            System.out.println("Enter elements in second array list");
            for (int i = 0; i < size2; i++) {
                secondArrayList.add(sc.nextLine());
            }

            // Display original Array
            System.out.println("-------------------------------------");
            System.out.println("First Original Array: " + firstArrayList);
            System.out.println("Second Original Array: " + secondArrayList);
            System.out.println("-------------------------------------");

            // Combine both array
            firstArrayList.addAll(secondArrayList);

            System.out.println("Array list after combining together: " + firstArrayList);
            System.out.println("-------------------------------------");

        } catch (InputMismatchException e) {
            System.out.println("Enter valid input " + e);
        }
    }
}
