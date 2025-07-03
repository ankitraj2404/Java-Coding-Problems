//Write a Java program to compare two array lists.

import java.util.ArrayList;
import java.util.Scanner;

public class Problem16 {

    // Method to compare arraylist
    public static boolean compareArrayList(ArrayList<Integer> firstArrayList, ArrayList<Integer> secondArrayList) {

        boolean[] visited = new boolean[firstArrayList.size()];

        if (firstArrayList.size() != secondArrayList.size()) {
            return false;
        }
        for (int i = 0; i < firstArrayList.size(); i++) {
            boolean found = false;
            for (int j = 0; j < firstArrayList.size(); j++) {
                if (!visited[j] && firstArrayList.get(i).equals(secondArrayList.get(j))) {
                    visited[j] = true;
                    found = true;
                    break;
                }
            }
            if (!found) {
                return false;
            }
        }
        return true;
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
            System.out.println("First Array list: " + firstArrayList);

            // Display second list
            System.out.println("Second Array list: " + secondArrayList);
            boolean flag = compareArrayList(firstArrayList, secondArrayList);

            if (flag) {
                System.out.print("Both ArrayList are equals");
            } else {
                System.out.println("ArrayList are not equals");
            }
        } catch (Exception e) {
            System.out.println("Enter valid input" + e);
        }
    }
}
