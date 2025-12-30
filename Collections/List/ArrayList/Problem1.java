
//Write a Java program to create an array list, add some colors (strings) and print out the collection.
import java.util.*;

public class Problem1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            ArrayList<String> obj = new ArrayList<>();

            obj.add("Black");
            obj.add("Blue");
            obj.add("Red");
            obj.add("Voilet");
            obj.add("White");

            for (String string : obj) {
                System.out.println(string + " ");
            }
        } catch (Exception e) {
            System.out.println(e.getClass());
        }
    }
}