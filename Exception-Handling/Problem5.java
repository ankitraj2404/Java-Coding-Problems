//Write a Java program to throw different types of exceptions in a single try block and handle them separately using a multi-catch clause.

public class Problem5 {
    public static void main(String[] args) {
        try {

            int a = 5, b = 0;
            int result = a / b;
            System.out.println(result);

            int[] arr = new int[] { 4, 5, 6, 7 };
            System.out.println(arr[4]);

        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e.getClass().getSimpleName());
            System.out.println("Message: " + e.getMessage());
        }
    }
}
