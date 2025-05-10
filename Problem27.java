/*Program to print the foloowing pattern

        *
      * *
    * * *
  * * * *
* * * * *

*/

import java.util.*;

public class Problem27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the no of rows: ");
            int row = sc.nextInt();

            for (int i = 1; i <= row; i++) {
                for (int j = 1; j <= row; j++) {
                    if (i + j <= row) {
                        System.out.print("  ");
                    } else {
                        System.out.print("* ");
                    }
                }
                System.out.println();
            }
            sc.close();
        } catch (InputMismatchException e) {
            System.out.println("Enter valid values");
        }
    }

}
