//Write a Java program to convert a HashSet to a stream, filter the elements by a specific pattern, and then print the filtered results.

import java.util.HashSet;
import java.util.Scanner;

public class Problem8 {
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

            System.out.print("Perfect square numbers in the Hash set: ");
            set.stream().filter(i -> {
                int sq = (int) Math.sqrt(i);
                return sq * sq == i;
            }).forEach(i -> System.out.print(i + " "));

        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());// TODO: handle exception
        }
    }
}
