//Write a Java program to iterate over an ArrayList of strings using a ListIterator and print elements in reverse order.

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("How many values do you want to enter in the list?");
            int size = sc.nextInt();
            sc.nextLine();

            ArrayList<String> elements = new ArrayList<>(size);
            System.out.println("Enter elements: ");
            int i = 0;
            while (i < size) {
                String str = sc.nextLine();
                elements.add(str);
                i++;
            }
            System.out.println("Original list: " + elements);

            ListIterator<String> lt = elements.listIterator(size);

            while (lt.hasPrevious()) {
                System.out.println(lt.previous());
            }
        } catch (NoSuchElementException e) {
            System.out.println(e);
        }
    }
}
