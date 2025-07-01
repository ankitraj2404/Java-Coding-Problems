//Write a Java program to reverse elements in an array list.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array List: ");
        int size = sc.nextInt();

        // Declare an ArrayList
        ArrayList<Integer> myArrayList = new ArrayList<>();

        System.out.println("Enter elements: ");
        // Take input from user
        for (int i = 0; i < size; i++) {
            myArrayList.add(sc.nextInt());
        }

        // Display array
        System.out.println("Original ArrayList: " + myArrayList);

        Collections.reverse(myArrayList);
        // Display array
        System.out.println("Reversed ArrayList: " + myArrayList);
    }

}
