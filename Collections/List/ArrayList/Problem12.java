//Write a Java program to extract a portion of an array list.

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Problem12 {

    // Method to extract portion of arraylist
    public static void subArrayList(int startingIndex, int endingIndex, int size, ArrayList<Integer> myArrayList) {
        if (startingIndex == endingIndex) {
            System.out.println("Index value should not be same");
            return;
        }
        if (startingIndex < 0 || endingIndex > size || startingIndex > endingIndex) {
            System.out.println("Enter a valid range.");
            return;
        }

        System.out.print("Sub-Array: ");
        for (int i = startingIndex; i <= endingIndex; i++) {
            System.out.print(myArrayList.get(i) + " ");
        }

    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of the array list: ");
            int size = sc.nextInt();

            ArrayList<Integer> myArrayList = new ArrayList<>();
            System.out.print("Enter element ");
            for (int i = 0; i < size; i++) {
                myArrayList.add(sc.nextInt());
            }

            // Display original list
            System.out.println("Original Array list: " + myArrayList);

            System.out.print("Enter the starting index value and ending index value for extracting the portion: ");
            int startingIndex = sc.nextInt();
            int endingIndex = sc.nextInt();
            subArrayList(startingIndex, endingIndex, size, myArrayList);
        } catch (InputMismatchException e) {
            System.out.println("Enter valid input" + e);
        }
    }

}
