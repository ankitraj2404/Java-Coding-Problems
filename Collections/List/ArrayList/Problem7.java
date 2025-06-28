
//Write a Java program to sort a given array list.
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Problem7 {
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
            System.out.print("Array List: ");
            for (Integer i : myArrayList) {
                System.out.print(i + ", ");
            }
            System.out.println();

            // Ascending Order
            Collections.sort(myArrayList);
            System.out.print("Array List after sorting in ascending order: ");
            for (Integer i : myArrayList) {
                System.out.print(i + ", ");
            }
            System.out.println();

            // Descending Order
            Collections.sort(myArrayList, Collections.reverseOrder());
            System.out.print("Array List after sorting in descending order: ");
            for (Integer i : myArrayList) {
                System.out.print(i + ", ");
            }
            System.out.println();

        } catch (InputMismatchException e) {
            System.out.println("Enter valid input " + e);
        }
    }

}
