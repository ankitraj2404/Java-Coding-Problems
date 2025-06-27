//Write a java program to copy one arraylist to another

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the size of the array: ");
            int size = sc.nextInt();
            sc.nextLine();// for taking the left line

            ArrayList<String> myArrayList = new ArrayList<>();

            // Enter elements
            System.out.println("Enter elements:");
            for (int i = 0; i < size; i++) {
                myArrayList.add(sc.nextLine());
            }
            System.out.println();

            // Display the arraylist
            System.out.print("Array List: ");
            for (String s : myArrayList) {
                System.out.print(s + " ");
            }
            System.out.println();

            // Declare another array to copy
            ArrayList<String> myArrayList2 = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                myArrayList2.add(myArrayList.get(i));
            }

            // Display arrayList
            System.out.print("Copied Array List: ");
            for (String s : myArrayList2) {
                System.out.print(s + ", ");
            }
        } catch (InputMismatchException e) {
            System.out.println("Enter valid input");
        } finally {
            sc.close();
        }
    }

}
