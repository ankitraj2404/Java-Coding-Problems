// Write a Java program where an exception is thrown inside a nested try block and re-thrown to be caught in an outer catch block.

public class Problem4 {
    public static void main(String[] args) {
        try {
            try {
                throw new NullPointerException("Inner Null Value");
            } catch (NullPointerException e) {
                System.out.println("inner catch: " + e.getMessage());
                throw e;
            }
        } catch (NullPointerException e) {
            System.out.println("Outer catch: " + e.getMessage());
        }
    }
}
