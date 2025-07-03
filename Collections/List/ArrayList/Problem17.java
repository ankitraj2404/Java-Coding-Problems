//Write a Java program to implement a custom comparison of two ArrayLists by sorting them first and then comparing element by element.

import java.util.ArrayList;
import java.util.Scanner;

public class Problem17 {

    public static void compareTwoArrayList(ArrayList<Integer> arraylist1, ArrayList<Integer> arraylist2) {

        if (arraylist1.size() != arraylist2.size()) {
            System.out.println("size must be same for comparing");
            return;
        }
        int size = arraylist1.size();
        // First array list sorting
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (arraylist1.get(j) > arraylist1.get(j + 1)) {
                    int temp = arraylist1.get(j);
                    arraylist1.set(j, arraylist1.get(j + 1));
                    arraylist1.set(j + 1, temp);
                }
            }
        }

        // Second array list sorting
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (arraylist2.get(j) > arraylist2.get(j + 1)) {
                    int temp = arraylist2.get(j);
                    arraylist2.set(j, arraylist2.get(j + 1));
                    arraylist2.set(j + 1, temp);
                }
            }
        }

        System.out.println("--------------------------------------------");
        System.out.println("First ArrayList after sorting: " + arraylist1);
        System.out.println("Second ArrayList after sorting: " + arraylist2);
        System.out.println("--------------------------------------------");

        // Compare elements one by one
        for (int i = 0; i < size; i++) {
            if (!arraylist1.get(i).equals(arraylist2.get(i))) {
                System.out.println("They are not equal");
                return; // Stop checking further
            }
        }
        System.out.println("Both ArrayList are equal.");

    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // First array List Details
            System.out.print("Enter the size of the array list: ");
            int size = sc.nextInt();
            sc.nextLine();

            ArrayList<Integer> firstArrayList = new ArrayList<>();
            System.out.println("Enter element of first array ");
            for (int i = 0; i < size; i++) {
                firstArrayList.add(sc.nextInt());
            }

            // Second array List Details
            ArrayList<Integer> secondArrayList = new ArrayList<>();
            System.out.println("Enter element of second array ");
            for (int i = 0; i < size; i++) {
                secondArrayList.add(sc.nextInt());
            }

            // Display first list
            System.out.println("--------------------------------------------");
            System.out.println("First Original Array list: " + firstArrayList);
            // Display second list
            System.out.println("Second Original Array list: " + secondArrayList);
            System.out.println("--------------------------------------------");

            compareTwoArrayList(firstArrayList, secondArrayList);
        } catch (Exception e) {
            System.out.println("Enter valid input" + e);
        }
    }
}
