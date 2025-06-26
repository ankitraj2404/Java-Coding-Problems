import java.util.ArrayList;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> myList = new ArrayList<String>();

        System.out.println("Add your 5 friends name");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter " + (i + 1) + " name: ");
            String name = sc.nextLine();
            myList.add(name);
        }

        // display
        for (String x : myList) {
            System.out.println("-------------------------------");
            System.out.print(x + ", ");
            System.out.println("-------------------------------");
        }
        sc.close();

    }

}
