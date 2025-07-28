//Write a Java program to create a lambda that simultaneously returns two lists: one with uppercase and one with lowercase versions.

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Problem9 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            List<String> inputList = Arrays.asList("java PROGRAMMING", "lambda EXPRESSIONS", "tItLe caSe exAmple");

            Function<List<String>, Map<String, List<String>>> process = input -> {
                Map<String, List<String>> map = new HashMap<>();
                map.put("UPPER", inputList.stream().map(String::toUpperCase).collect(Collectors.toList()));
                map.put("Lower", inputList.stream().map(String::toLowerCase).collect(Collectors.toList()));

                return map;
            };

            Map<String, List<String>> result = process.apply(inputList);

            System.out.println("UpperCase: " + result.get("UPPER"));
            System.out.println("LowerrCase: " + result.get("Lower"));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
