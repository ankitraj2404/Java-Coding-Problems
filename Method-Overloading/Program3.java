import java.util.*;

public class Program3 {

    // Method to validate name
    static void validate(String name) {
        int len = name.length();

        for (int i = 0; i < len; i++) {
            char ch = name.charAt(i);
            if (!(ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'b')) {
                System.out.println("Invalid Name!!!!!!Contains non-aplhabets");
                return;
            }
        }
        System.out.println("Valid Name");
    }

    // Method to validate age
    static void validate(int age) {
        if (age >= 18)
            System.out.println("You are eligible for voting");
        else
            System.out.println("You are not eligible for voting");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter your name: ");
            String name = sc.nextLine();
            System.out.println("Enter your age: ");
            int age = sc.nextInt();
            validate(age);
            validate(name);
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        } finally {
            sc.close();
        }
    }

}
