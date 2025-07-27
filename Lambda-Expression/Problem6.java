
//Write a Java program to compose a lambda that verifies a string’s emptiness and logs an error if it is.
import java.util.*;
import java.util.function.Predicate;

public class Problem6 {
    public static void checkString(String s, Predicate<String> check) {
        if (check.test(s)) {
            System.err.println("String is empty!!!!!!!");
        } else {
            System.out.println("String is not empty");
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a word: ");
            String str = sc.nextLine();

            Predicate<String> check = s -> s.trim().isEmpty();
            checkString(str, check);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}