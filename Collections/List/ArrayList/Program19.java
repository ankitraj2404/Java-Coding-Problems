//Write a Java program to retrieve an element at a specified index using Java streams and Optional to handle missing values.

import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Program19 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("How many valued do you want to keep in the list?");
            int size = sc.nextInt();

            ArrayList<Integer> list = new ArrayList<>(size);
            int temp = size;
            System.out.println("Enter elements: ");
            while (size > 0) {
                list.add(sc.nextInt());
                size--;
            }
            System.out.println("Original list: " + list);

            System.out.println("Enter the index value you want to retrieve between 0 and " + (temp - 1) + ": ");
            int index = sc.nextInt();

            Optional<Integer> extract = IntStream.range(0, temp)
                    .filter(i -> i == index)
                    .mapToObj(i -> list.get(i))
                    .findFirst();

            extract.ifPresentOrElse(v -> System.out.println("Element at index " + index + " is: " + v),
                    () -> System.out.println("No element found"));
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
