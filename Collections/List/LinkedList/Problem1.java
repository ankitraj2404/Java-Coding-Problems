import java.util.LinkedList;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList<Integer> myList = new LinkedList<>();

        System.out.println("How many elements do you want?");
        int size = sc.nextInt();
        System.out.println("Enter elements: ");

        for (int i = 0; i < size; i++) {
            int elements = sc.nextInt();
            myList.add(elements);
        }

        System.out.print("Linked list: ");
        for (Integer x : myList) {
            System.out.print(x + ", ");
        }
        sc.close();
    }
}
