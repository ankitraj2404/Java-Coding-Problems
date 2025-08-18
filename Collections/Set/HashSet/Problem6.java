//Write a Java program to iterate over a HashSet using an Iterator and print only the elements that satisfy a given condition.

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter the size of the Set: ");
            int size = sc.nextInt();

            System.out.println("Enter elements: ");
            HashSet<Integer> set = new HashSet<>();
            for (int i = 0; i < size; i++) {
                set.add(sc.nextInt());
            }

            Iterator<Integer> it = set.iterator();
            System.out.print("Even numbers in the Hash set: ");
            while (it.hasNext()) {
                int value = it.next();
                if (value % 2 == 0) {
                    System.out.print(value + " ");
                }
            }
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());// TODO: handle exception
        }
    }
}
