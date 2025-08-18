//Write a Java program to add an element to a HashSet, remove it, and then re-add it to observe the effect on the set's ordering.

import java.util.HashSet;
import java.util.Scanner;

public class Problem4 {
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

            System.out.print("Enter the element to add in the hash set: ");
            int element = sc.nextInt();

            set.add(element);
            System.out.println("Hash Set after adding " + element + ": " + set);
            set.remove(element);
            System.out.println("Hash Set after removing " + element + ": " + set);
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());// TODO: handle exception
        }
    }
}
