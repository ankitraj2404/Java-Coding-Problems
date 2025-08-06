//Write a Java program to create an ArrayList of colors, add duplicates, then remove them and print the unique collection.

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class Problem2 {
    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Violet");
        colors.add("Blue");
        colors.add("Red");

        System.out.println("Original list: " + colors); // Printing original list

        ArrayList<String> uniqueColors = new ArrayList<>(); // One way
        for (String color : colors) {
            if (!uniqueColors.contains(color)) {
                uniqueColors.add(color);
            }
        }
        System.out.println("Unique list: " + uniqueColors);

        Set<String> uniqueElement = new LinkedHashSet<>(colors); // linkedhashset will follow the insertion order.
        System.out.print("List after no duplicates: ");
        uniqueElement.forEach((e) -> {
            System.out.print(e + " ");
        });
    }
}
