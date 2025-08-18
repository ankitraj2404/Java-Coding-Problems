//Write a Java program to append multiple elements to a HashSet and then convert it to a TreeSet to display the elements in sorted order.

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Problem3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter the size of the Set: ");
            int size = sc.nextInt();

            System.out.println("Enter elements: ");
            HashSet<Integer> set = new HashSet<>();
            for (int i = 0; i < size; i++) {
                set.add(sc.nextInt());
            }
            System.out.println("Original Set: " + set);

            TreeSet<Integer> treeSet = new TreeSet<>();

            for (int i = 1; i <= size; i++) {
                treeSet.addAll(set);
            }

            System.out.println("After adding elements of hash set in tree set: " + treeSet);

        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
