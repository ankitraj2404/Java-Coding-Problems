
//Write a Java program to create an ArrayList of colors and use a lambda expression to filter out colors containing a specific substring before printing.
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Problem3 {
    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>(List.of("Red", "Blue", "Green", "Light Green", "Light Red"));
        System.out.println("original List: " + colors);

        String subString = "Light";

        ArrayList<String> newList = colors.stream() // One way by using Streams
                .filter((c1) -> {
                    if (!c1.contains(subString)) {
                        return true;
                    }
                    return false;
                })
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println("After removal of " + subString + " from the list by using Streams: " + newList);

        colors.removeIf(c -> c.contains(subString)); // Direct from the list
        System.out.println("After removal of " + subString + " from the list: " + colors);
    }
}
