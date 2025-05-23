
//Program to reverse a word
import java.util.*;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the word to reverse: ");
        String word = sc.nextLine();

        String rev = "";
        int len = word.length();

        for (int i = len - 1; i >= 0; i--) {
            rev += word.charAt(i);
        }
        System.out.println();
        System.out.println("The reverse of " + word + " is: " + rev);
        sc.close();

    }

}
