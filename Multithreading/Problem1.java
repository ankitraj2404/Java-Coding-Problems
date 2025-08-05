
//First Multithreading program.
import java.util.Scanner;

public class Problem1 extends Thread {
    public void run() {
        int i = 1;
        while (true) {
            System.out.println(i + "Hello");
            i++;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            Problem1 myProgram = new Problem1();
            myProgram.start();

            int i = 1;
            while (true) {
                System.out.println(i + "World");
                i++;
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
