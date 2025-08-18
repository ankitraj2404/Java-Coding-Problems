//Write a Java program to get the number of elements in a hash set.

import java.util.HashSet;
import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter elements in the hash set(Enter 0 for stopping): ");
            int value;
            HashSet<Integer> set = new HashSet<>();

            do {
                value = sc.nextInt();
                if (value != 0) {
                    set.add(value);
                }
            } while (value != 0);

            System.out.println("Size of the set: " + set.size());
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
