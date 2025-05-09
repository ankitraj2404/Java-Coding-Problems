//Program to check whether a number or string is palindrome or not

import java.util.*;

public class Problem17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number or string: ");
        String value = sc.nextLine();

        int len = value.length();
        String rev_val = "";

        for (int i = len - 1; i >= 0; i--) {
            rev_val += value.charAt(i);
        }
        if (value.equals(rev_val)) {
            System.out.println(value + " is Palindrome");
        } else {
            System.out.println(value + " is not a Palindrome");
        }
        sc.close();
    }
}
