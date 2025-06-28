
//Write a Java program to shuffle elements in an array list.
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("ENter the size of the array list: ");
            int size = sc.nextInt();

            // Declare arraylist
            ArrayList<Integer> myArrayList = new ArrayList<>();

            // Take input
            System.out.println("Enter elements in the arraylist");
            for (int i = 0; i < size; i++) {
                System.out.print("Enter element at index " + (i + 1) + ": ");
                myArrayList.add(sc.nextInt());
            }

            // Display arraylist
            System.out.print("Array List: " + myArrayList);
            System.out.println();

            // Shuffle of ArrayList
            Collections.shuffle(myArrayList);
            System.out.print("ArrayList after shuffling of element: " + myArrayList);
            System.out.println();

        } catch (InputMismatchException e) {
            System.out.println("Enter valid input");
        }
    }

}
