//Write a Java program to extract a sublist from an ArrayList using subList() and then print the sublist.

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Problem13 {

    // method to find subArrayList
    public static void subArrayList(int startingIndex, int endingIndex, ArrayList<String> myArrayList) {
        List<String> subPortion = myArrayList.subList(startingIndex, endingIndex);
        System.out.println("Sub-Portion: " + subPortion);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter the size of the array list: ");
            int size = sc.nextInt();
            sc.nextLine();

            ArrayList<String> myArrayList = new ArrayList<>();
            System.out.print("Enter element ");
            for (int i = 0; i < size; i++) {
                myArrayList.add(sc.nextLine());
            }

            // Display original list
            System.out.println("Original Array list: " + myArrayList);

            System.out.print("Enter the starting index value and ending index value for extracting the portion: ");
            int startingIndex = sc.nextInt();
            int endingIndex = sc.nextInt();

            subArrayList(startingIndex, endingIndex, myArrayList);
        } catch (InputMismatchException e) {
            System.out.println("ENter valid inputs");
        }
    }
}
