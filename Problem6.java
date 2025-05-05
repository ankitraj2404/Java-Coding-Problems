//Program to check the grade of the student 

import java.util.*;

public class Problem6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Entet the marks of the three subjects: ");
            float sub1 = sc.nextFloat();
            float sub2 = sc.nextFloat();
            float sub3 = sc.nextFloat();

            float total = sub1 + sub2 + sub3;
            float avg = total / 3;

            if (avg > 80) {
                System.out.print("Your Grade is A");
            } else if (avg >= 70 && avg <= 80) {
                System.out.print("Your Grade is B");
            } else if (avg >= 60 && avg <= 70) {
                System.out.print("Your Grade is C");
            } else if (avg >= 50 && avg <= 60) {
                System.out.print("Your Grade is D");
            } else {
                System.out.print("Your Grade is F");
            }
        } catch (InputMismatchException e) {
            System.out.println("Enter valid marks");
        }
        sc.close();
    }

}
