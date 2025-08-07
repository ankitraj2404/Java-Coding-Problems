
//Write a Java program to iterate through an ArrayList using Java streams and forEach(), and print each element with its index.
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Problem8 {
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

            IntStream.range(0, elements.size()) // Iterating through the list by using IntStream
                    .forEach(index -> System.out.println("Index: " + index + " Value: " + elements.get(index)));

            System.out.println("-----------------------------------");

            AtomicInteger at = new AtomicInteger(0); // By using atomicInteger
            elements.stream()
                    .forEach(e -> System.out.println("Index: " + at.getAndIncrement() + " value: " + e));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
