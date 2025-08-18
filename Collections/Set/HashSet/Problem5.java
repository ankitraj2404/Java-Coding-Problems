//Write a Java program to iterate through all elements in a hash list.

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Problem5 {
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
            System.out.print("Hash set: ");
            while (it.hasNext()) {
                System.out.print(it.next() + " ");
            }
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());// TODO: handle exception
        }
    }
}
