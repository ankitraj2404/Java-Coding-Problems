//Write a Java program to retrieve the last element of an ArrayList by calculating its size dynamically.

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Problem20 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            ArrayList<Integer> list = new ArrayList<>();

            boolean keepAdding = true;
            System.out.println("Enter elements in the list: ");
            while (keepAdding) {
                list.add(sc.nextInt());
                sc.nextLine();
                System.out.println("Do you want to stop adding elements(Press Yes or No)?");
                String str = sc.nextLine();

                if (str.equalsIgnoreCase("Yes")) {
                    keepAdding = false;
                }
            }
            System.out.println("List: " + list);

            int size = list.size();
            System.out.println("Element at last index: " + list.get(size - 1));
        } catch (InputMismatchException e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
