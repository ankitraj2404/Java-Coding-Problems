//Write a Java program to append the specified element to the end of a hash set.

import java.util.HashSet;
import java.util.Scanner;

public class Problem1 {
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
            System.out.println("Enter the element to add in the hash set: ");
            int element = sc.nextInt();

            set.add(element);

            System.out.println("Hash Set after adding " + element + " at the last: " + set);

        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
