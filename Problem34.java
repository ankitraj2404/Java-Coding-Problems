
/* Program to print the following pattern

       *
      * *
     * * *
    * * * * 
   * * * * *
  * * * * * *
 * * * * * * *
* * * * * * * *

 */
import java.util.*;

public class Problem34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the no of rows: ");
            int row = sc.nextInt();

            for (int i = 1; i <= row; i++) {
                for (int j = 1; j <= row; j++) {
                    if (i + j <= row) {
                        System.out.print(" ");
                    } else {
                        System.out.print("* ");
                    }
                }
                System.out.println();
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid inputs");
        } finally {
            sc.close();
        }
    }
}