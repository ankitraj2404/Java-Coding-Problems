
//Program to check whether a person is young or not
import java.util.InputMismatchException;
import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            if (age < 0) {
                System.out.print("Please enter positive age value");
            } else if (age >= 14 && age <= 55) {
                System.out.print("You are young");
            } else {
                System.out.println("You are not young");
            }
        } catch (InputMismatchException e) {
            System.out.println("Please enter valid age in integer");
        }
        sc.close();
    }
}
