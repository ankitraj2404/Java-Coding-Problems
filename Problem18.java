//Program to print the digits of a number even with the trailing zero

import java.util.*;

public class Problem18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        String num = sc.nextLine();

        int len = num.length();

        for (int i = 0; i < len; i++) {
            char c = num.charAt(i);

            switch (c) {
                case '0':
                    System.out.print("Zero" + " ");
                    break;
                case '1':
                    System.out.print("One" + " ");
                    break;
                case '2':
                    System.out.print("Two" + " ");
                    break;
                case '3':
                    System.out.print("Three" + " ");
                    break;
                case '4':
                    System.out.print("Four" + " ");
                    break;
                case '5':
                    System.out.print("Five" + " ");
                    break;
                case '6':
                    System.out.print("Six" + " ");
                    break;
                case '7':
                    System.out.print("Seven" + " ");
                    break;
                case '8':
                    System.out.print("Eight" + " ");
                    break;
                case '9':
                    System.out.print("Nine" + " ");
                    break;
                case '-':
                    System.out.print("Minus ");
                    break;
                default:
                    System.out.print("not a digit");
                    break;
            }
        }
        sc.close();
    }
}
