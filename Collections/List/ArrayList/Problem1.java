
//Write a Java program to create an array list, add some colors (strings) and print out the collection.
import java.util.ArrayList;
import java.util.List;

public class Problem1 {
    public static void main(String[] args) {

        List<String> colors = new ArrayList<>(List.of("Red", "Blue", "Green", "Violet", "Indigo"));

        colors.forEach(System.out::println);
    }
}
