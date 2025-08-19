//Write a Java program to implement a custom method to count the number of elements in a HashSet without calling the size() method.

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Problem13 {

    public static int countElements(HashSet<Integer> set) {

        Iterator<Integer> it = set.iterator();
        int count = 0;
        while (it.hasNext()) {
            it.next();
            count++;
        }
        return count;
    }

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

            int count = countElements(set);
            System.out.println("Size of the hash set: " + count);

        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
