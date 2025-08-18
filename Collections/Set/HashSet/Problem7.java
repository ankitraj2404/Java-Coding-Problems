//Write a Java program to iterate through a HashSet using Java 8 forEach() and a lambda expression, printing each element with its hash code.

import java.util.HashSet;
import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter the size of the Set: ");
            int size = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter elements: ");
            HashSet<String> set = new HashSet<>();
            for (int i = 0; i < size; i++) {
                set.add(sc.nextLine());
            }

            set.stream().forEach(i -> System.out.println("Element: " + i + " , " + " HashCode: " + i.hashCode()));
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());// TODO: handle exception
        }
    }
}
