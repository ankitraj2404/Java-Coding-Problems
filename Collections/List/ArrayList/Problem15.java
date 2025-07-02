//Write a Java program to remove a range of elements from an ArrayList and print the remaining list.

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Problem15 {
    public static void removeRange(int startingIndex, int endingIndex, int size, ArrayList<String> myArrayList) {
        if (startingIndex < 0 || startingIndex > endingIndex || endingIndex > size) {
            throw new IndexOutOfBoundsException("Invalid range");
        }
        myArrayList.subList(startingIndex, endingIndex).clear();
        System.out.println("List after removing elements between index " + startingIndex + " to " + endingIndex + ": "
                + myArrayList);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of the array list: ");
            int size = sc.nextInt();
            sc.nextLine();

            ArrayList<String> myArrayList = new ArrayList<>();
            System.out.println("Enter element ");
            for (int i = 0; i < size; i++) {
                myArrayList.add(sc.nextLine());
            }

            // Display original list
            System.out.println("Original Array list: " + myArrayList);

            System.out.println("Enter starting index: ");
            int startingIndex = sc.nextInt();
            System.out.println("Enter ending index: ");
            int endingIndex = sc.nextInt();

            // Calling method to remove the specific range
            removeRange(startingIndex, endingIndex, size, myArrayList);

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Unexpected Error: " + e.getMessage());
        }
    }
}
