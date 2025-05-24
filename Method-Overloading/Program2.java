
//Method Overloading program to reverse an integer and array
import java.util.InputMismatchException;
import java.util.Scanner;

public class Program2 {

    // Method to reverse an integer
    static int reverse(int num) {
        int rem, sum = 0;
        while (num != 0) {
            rem = num % 10;
            sum = sum * 10 + rem;
            num = num / 10;
        }

        return sum;
    }

    // Method to reverse an array
    static int[] reverse(int[] arr) {
        int[] reversedArray = new int[arr.length];

        for (int i = (arr.length - 1), j = 0; i >= 0; i--, j++) {
            reversedArray[j] = arr[i];
        }
        return reversedArray;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("What do you want to do?(1 for Reversing a number 2 for Reversing an array)");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the number toreverse: ");
                    int num = sc.nextInt();
                    int rev = reverse(num);
                    System.out.println("The reverse of " + num + " is: " + rev);
                    break;

                case 2:
                    System.out.println("Enter the size of the array: ");
                    int size = sc.nextInt();

                    System.out.println("Enter the elements of the array: ");
                    int[] arr = new int[size];
                    for (int i = 0; i < size; i++) {
                        arr[i] = sc.nextInt();
                    }
                    // Display array:
                    System.out.print("Original Array: ");
                    for (int x : arr) {
                        System.out.print(x + " ");
                    }
                    System.out.print("\n");
                    int[] reversedArray = reverse(arr);
                    System.out.print("Array after reversing: ");
                    for (int x : reversedArray) {
                        System.out.print(x + " ");
                    }
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        } finally {
            sc.close();
        }
    }

}
