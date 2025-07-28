import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Problem8 {
    public static void main(String[] args) {
        List<String> inputList = Arrays.asList("java PROGRAMMING", "lambda EXPRESSIONS", "tItLe caSe exAmple");

        // Lambda expression to convert a string to Title Case
        List<String> titleCaseList = inputList.stream()
                .map(str -> Arrays.stream(str.split(" "))
                        .map(word -> word.isEmpty() ? word
                                : Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase())
                        .collect(Collectors.joining(" ")))
                .collect(Collectors.toList());

        // Output result
        System.out.println("Original List: " + inputList);
        System.out.println("Title Case List: " + titleCaseList);
    }
}
