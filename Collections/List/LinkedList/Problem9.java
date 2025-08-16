//Write a Java program to iterate over a linked list using Java 8 forEach() and a lambda expression.

import java.util.LinkedList;
import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter the size of the linked list: ");
            int size = sc.nextInt();

            LinkedList<Integer> list = new LinkedList<>();
            System.out.println("Enter elements: ");
            for (int i = 0; i < size; i++) {
                list.add(sc.nextInt());
            }
            System.out.print("List: ");
            list.forEach(i -> System.out.print(i + " "));

        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}