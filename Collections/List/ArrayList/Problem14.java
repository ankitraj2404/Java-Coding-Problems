//Write a Java program to insert an element at the first position and then validate the insertion by comparing the new first element.

import java.util.ArrayList;
import java.util.Scanner;

public class Problem14 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("How many values do you want: ");
            int size = sc.nextInt();

            ArrayList<Integer> list = new ArrayList<>();

            while (size > 0) {
                list.add(sc.nextInt());
                size--;
            }

            System.out.println("original List: " + list);

            System.out.println("Enter the element you want to enter at the first index: ");
            int num = sc.nextInt();

            list.add(0, num);

            if (list.get(0).equals(num)) {
                System.out.println(num + " is successfully added at the first index" + list);
            } else {
                System.out.println(num + " is not added");
            }
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
