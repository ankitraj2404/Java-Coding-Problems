//Write a Java program to implement a lambda that maps a list of mixed-case strings to a list of alternating uppercase and lowercase letters.

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Problem10 {
    public static void main(String[] args) {

        List<String> mixed = Arrays.asList("ApPle", "mAnGo", "tAnGo", "dJanGo");

        Function<List<String>, List<String>> process = list -> list.stream()
                .map(str -> {
                    StringBuffer sb = new StringBuffer();

                    for (int i = 0; i < str.length(); i++) {
                        char ch = str.charAt(i);

                        sb.append(i % 2 == 0 ? Character.toUpperCase(ch) : Character.toLowerCase(ch));
                    }
                    return sb.toString();
                })
                .collect(Collectors.toList());

        System.out.println("Alternate string list: " + process.apply(mixed));

    }
}