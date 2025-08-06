
//Write a Java program to create an ArrayList of colors, sort them in reverse alphabetical order, and print the resulting collection.
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Problem4 {
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

            Collections.sort(colors);
            Collections.reverse(colors);

            System.out.println("Reversed List after sorting: " + colors);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
