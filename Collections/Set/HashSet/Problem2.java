//Write a Java program to add an element to a HashSet and verify its presence using the contains() method.

import java.util.HashSet;
import java.util.Scanner;

public class Problem2 {
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

            if (set.contains(element)) {
                System.out.println("Yes it contains " + element);
            } else {
                System.out.println("No it not contains " + element);
            }

        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());// TODO: handle exception
        }
    }
}
