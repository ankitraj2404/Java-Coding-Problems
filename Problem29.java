
/*Program to print the following pattern

* * * * *
* * * *
* * *
* *
*

*/
import java.util.*;

public class Problem29 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the no of row: ");
            int row = sc.nextInt();

            for (int i = row; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        } catch (InputMismatchException e) {
            System.out.println("Enter valid no of rows");
        }
        sc.close();

    }

}
