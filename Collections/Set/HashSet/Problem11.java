// Write a Java program to determine the size of a HashSet after performing bulk insertion and deletion operations.

import java.util.HashSet;
import java.util.Scanner;

public class Problem11 {
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
            System.out.println("Enter elements to remove(Enter -1 to stop): ");
            int removeElement;

            do {
                removeElement = sc.nextInt();
                if (removeElement != -1) {
                    if (set.contains(removeElement)) {
                        set.remove(removeElement);
                    }
                }
            } while (removeElement != -1);

            System.out.println("Size of the hash set: " + set.size());

        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
