//Write a Java program that swaps two elements in an array list.

import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Problem18 {

    // Method to swap two elements
    public static void elementSwap(ArrayList<String> myArrayList, int swap, int swapWith) {
        if (swap < 0 || swap >= myArrayList.size() || swapWith < 0 || swapWith >= myArrayList.size()) {
            System.out.println("Invalid indices. Please enter indices within 0 to " + (myArrayList.size() - 1));
            return;
        }

        // Swap elements
        String temp = myArrayList.get(swap);
        myArrayList.set(swap, myArrayList.get(swapWith));
        myArrayList.set(swapWith, temp);

        // Display updated list
        System.out.println("Updated ArrayList after swapping: " + myArrayList);
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

            System.out.print("Enter the index element you want to swap : ");
            int swap = sc.nextInt();
            System.out.print("Enter the index element you want to swap with : ");
            int swapWith = sc.nextInt();

            elementSwap(myArrayList, swap, swapWith);
        } catch (InputMismatchException e) {
            System.out.println("Enter valid input " + e);
        }
    }
}
