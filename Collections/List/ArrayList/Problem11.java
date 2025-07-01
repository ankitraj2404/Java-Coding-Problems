//Write a Java program to reverse an ArrayList manually using a loop and swap operations.

import java.util.ArrayList;
import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {
        int temp = 0;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of the arrayList: ");
            int size = sc.nextInt();

            ArrayList<Integer> myArrayList = new ArrayList<>();

            System.out.println("Enter elements: ");
            // Take input from user
            for (int i = 0; i < size; i++) {
                myArrayList.add(sc.nextInt());
            }

            // Display array
            System.out.println("Original ArrayList: " + myArrayList);

            for (int i = 0; i < (size / 2); i++) {
                int j = size - 1 - i;

                temp = myArrayList.get(i);
                myArrayList.set(i, myArrayList.get(j));
                myArrayList.set(j, temp);
            }
            // Reversed ArrayList
            System.out.println("Reversed Array List: " + myArrayList);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
