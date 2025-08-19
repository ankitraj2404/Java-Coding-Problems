//Write a Java program to count the elements in a HashSet using Java streams and compare the result with the size() method.

import java.util.HashSet;
import java.util.Scanner;

public class Problem12 {
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

            int size = set.size();
            long count = set.stream().count();

            if (size == count) {
                System.out.println("Same Size");
            }

        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
