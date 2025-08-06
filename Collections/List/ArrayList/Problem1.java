
// Write a Java program to create an array list, add some colors (strings) and print out the collection.
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Problem1 {
    public static void main(String[] args) {

        List<String> colors = new ArrayList<>(List.of("Red", "Blue", "Green", "Violet", "Indigo"));

        colors.forEach(System.out::println); // one way

        Iterator<String> it = colors.iterator();// by using iterator

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
