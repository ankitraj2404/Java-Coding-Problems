
//Write a java program to check a state name is present or not in the arraylist
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> myList = new ArrayList<String>();

        System.out.println("Enter the size of the arraylist: ");
        int size = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < size; i++) {
            System.out.print("Enter " + (i + 1) + " state name of india: ");
            String stateName = sc.nextLine();
            myList.add(stateName);
        }
        // check for TamilNadu
        Iterator<String> myIterator = myList.iterator();
        boolean found = false;

        while (myIterator.hasNext()) {
            String value = myIterator.next();
            if (value.equalsIgnoreCase("TamilNadu")) {
                System.out.println("TamilNadu is there in the list");
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("TamilNadu is there in the list.");
        } else {
            System.out.println("TamilNadu is not there in the list.");
        }
        sc.close();
    }
}