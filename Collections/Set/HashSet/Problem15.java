// Write a Java program to remove all elements from a HashSet by iterating through it and then print the final size.

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Problem15 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter elements in the hash set(Enter 0 to stop): ");
            HashSet<Integer> set = new HashSet<>();
            int value;
            do {
                value = sc.nextInt();
                if (value != 0) {
                    set.add(value);
                }
            } while (value != 0);

            Iterator<Integer> it = set.iterator();

            while (it.hasNext()) {
                it.next();
                it.remove();
            }

            System.out.println("Is set empty ? Ans:-" + set.isEmpty());

        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
