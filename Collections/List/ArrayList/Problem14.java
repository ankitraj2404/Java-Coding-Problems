//Write a Java program to extract the first half of an ArrayList and then merge it with the second half reversed.

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Problem14 {

    // Extracting half part
    public static List<String> extractHalfPart(int size, ArrayList<String> myArrayList) {
        int halfSize = size / 2;

        return new ArrayList<>(myArrayList.subList(0, halfSize));
    }

    // Reverse the left part
    public static List<String> extractReverseHalfPart(int size, ArrayList<String> myArrayList) {
        int startingIndex = size / 2;
        List<String> reversePart = new ArrayList<>(myArrayList.subList(startingIndex, size));
        Collections.reverse(reversePart);
        return reversePart;
    }

    // Merge both part
    public static void mergeArrayList(List<String> halfPart, List<String> reversePart) {
        ArrayList<String> updatedList = new ArrayList<>();

        updatedList.addAll(halfPart);
        updatedList.addAll(reversePart);

        System.out.println("After merge: " + updatedList);
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
            System.out.println("-----------------------------------------------------------");
            List<String> halfPart = extractHalfPart(size, myArrayList);
            List<String> halfReversePart = extractReverseHalfPart(size, myArrayList);

            // First half part
            System.out.println("First half part: " + halfPart);
            System.out.println("------------------------------------------------------------");
            System.out.println("Reversed Second Half Part: " + halfReversePart);
            System.out.println("------------------------------------------------------------");

            // Calling merge method
            mergeArrayList(halfPart, halfReversePart);

        } catch (InputMismatchException e) {
            System.out.println("Enter valid input");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Enter valid range");
        }
    }
}
