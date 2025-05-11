
/*Program to print the following pattern

A
A B
A B C
A B C D
A B C D E
A B C D E F
A B C D E F G
 
 */
import java.util.*;

public class Problem30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the no of rows: ");
            int row = sc.nextInt();

            for (int i = 1; i <= row; i++) {
                char c = 'A';
                for (int j = 1; j <= i; j++) {
                    System.out.print(c + " ");
                    c++;
                }
                System.out.println();

            }
            sc.close();
        } catch (InputMismatchException e) {
            System.out.println("Enter valid number of rows in form of integer");
        }
    }

}
