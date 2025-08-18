//Write a Java program to iterate over a HashSet, convert each element to uppercase, and collect the results into a new HashSet.

import java.util.HashSet;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem9 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter the size of the hash set: ");
            int size = sc.nextInt();
            sc.nextLine();

            HashSet<String> set = new HashSet<>();
            for (int i = 1; i <= size; i++) {
                set.add(sc.nextLine());
            }
            System.out.println("Original Hash Set: " + set);

            HashSet<String> elementInUpperCase = set.stream() // Elements in uppercase
                    .map((String::toUpperCase))
                    .collect(Collectors.toCollection(HashSet::new));

            System.out.println("Elements in uppercase: " + elementInUpperCase);

            HashSet<String> titleCase = set.stream() // Additional elements in titlecase
                    .map(i -> i.isEmpty() ? i : i.substring(0, 1).toUpperCase() + i.substring(1).toLowerCase())
                    .collect(Collectors.toCollection(HashSet::new));

            System.out.println("Elements in Title Case: " + titleCase);

        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
