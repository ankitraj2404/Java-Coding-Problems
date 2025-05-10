
/*Program to print the following pattern

1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
 */
import java.util.*;

public class Problem25 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter the no of rows: ");
            int row = sc.nextInt();
            System.out.println();

            for (int i = row; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
            sc.close();
        } catch (InputMismatchException e) {
            System.out.println("Enter only valid values");
        }
    }

}
