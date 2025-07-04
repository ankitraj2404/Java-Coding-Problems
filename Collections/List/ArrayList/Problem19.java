//Write a Java program to swap the elements at two specified indices in an ArrayList using Collections.swap().

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Problem19 {
    public interface swapElement {
        public ArrayList<Integer> swapIntegers(ArrayList<Integer> myArrayList, int ndex1, int index2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter the size of the array list: ");
            int size = sc.nextInt();
            sc.nextLine();

            ArrayList<Integer> firstArrayList = new ArrayList<>();
            System.out.println("Enter element of first array ");
            for (int i = 0; i < size; i++) {
                firstArrayList.add(sc.nextInt());
            }
            System.out.println(firstArrayList);

            System.out.print("Enter the swap index: ");
            int swapIndex = sc.nextInt();

            System.out.print("Enter the swap index with: ");
            int swapIndexWith = sc.nextInt();

            // Lambda Expression
            swapElement swapping = (list, index1, index2) -> {
                Collections.swap(firstArrayList, swapIndex, swapIndexWith);
                return list;
            };

            ArrayList<Integer> swappedArrayList = swapping.swapIntegers(firstArrayList, swapIndex, swapIndexWith);
            System.out.println("Array list after swapping of index " + swapIndex + " with index " + swapIndexWith
                    + " : " + swappedArrayList);
        } catch (InputMismatchException e) {
            System.out.println("Enter valid input");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid index! Please ensure indices are within the list size.");
        } finally {
            sc.close();
        }
    }
}
