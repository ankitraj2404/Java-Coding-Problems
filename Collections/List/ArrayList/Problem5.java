//Write a Java program to create an ArrayList of colors, convert all color names to title case using streams, and then print the list.

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem5 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            ArrayList<String> colors = new ArrayList<>();

            System.out.println("How many colors do you want to enter?");
            int size = sc.nextInt();
            sc.nextLine();
            int i = 0;

            System.out.println("Enter elements: ");
            while (i < size) {
                String str = sc.nextLine();
                colors.add(str);
                i++;
            }
            System.out.println("Original List: " + colors);

            List<String> titleCase = colors.stream() // One way by using Streams
                    .map(c -> {
                        if (!c.isEmpty()) {
                            return Character.toUpperCase(c.charAt(0)) + c.substring(1).toLowerCase();
                        }
                        return c;
                    })
                    .collect(Collectors.toList());

            System.out.println("After transforming the list into title case by using streams: " + titleCase);

            List<String> result = new ArrayList<>(); // Second way by using forEach loop
            for (String string : colors) {
                if (!string.isEmpty()) {
                    String capitalized = Character.toUpperCase(string.charAt(0)) + string.substring(1).toLowerCase();
                    result.add(capitalized);
                } else {
                    result.add(string);
                }
            }
            System.out.println("After converting the list into title case by using forEach loop: " + result);

            ListIterator<String> it = colors.listIterator(); // Third way by using ListIterator
            while (it.hasNext()) {

                String word = it.next();
                if (!word.isEmpty()) {
                    String capitalized = Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();
                    it.set(capitalized);
                }
            }
            System.out.println("After converting all color names into title case by using ListIterstor: " + colors);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
