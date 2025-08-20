// Write a Java program to empty an hash set.

import java.util.HashSet;
import java.util.Scanner;

public class Problem14 {
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

            set.clear();

            System.out.println("Is set empty ? Ans:-" + set.isEmpty());

        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
