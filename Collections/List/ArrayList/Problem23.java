// Write a Java program to update elements of an ArrayList using a lambda expression that appends the element's index to its value.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Problem23 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("How many elements do you want to add?");
            int size = sc.nextInt();

            ArrayList<String> list = new ArrayList<>(size);

            for (int i = 0; i < size; i++) {
                list.add(sc.nextLine());
            }

            System.out.println("Original list: ");

            List<String> modifiedList = IntStream.range(0, size - 1)
                    .mapToObj(i -> {
                        StringBuilder sb = new StringBuilder(list.get(i));
                        sb.append(i);
                        return sb.toString();
                    })
                    .collect(Collectors.toList());

            System.out.println("List after appending elements with the index value: " + modifiedList);

        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
