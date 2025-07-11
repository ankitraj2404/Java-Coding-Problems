//Write a Java program to create multiple threads that increment a shared counter using synchronized blocks and then print the final value.

import java.util.Scanner;

class myThread extends Thread {
    private Counter counter;
    private int incrementPerThread;

    public myThread(Counter counter, int incrementPerThread) {
        this.counter = counter;
        this.incrementPerThread = incrementPerThread;
    }

    public void run() {
        for (int i = 0; i < incrementPerThread; i++) {
            counter.increment();
        }
    }
}

class Counter {
    private int count = 0;
    static Object lock = new Object();

    public void increment() {
        synchronized (lock) {
            count++; // Critical Section
        }
    }

    public int getCount() {
        return count;
    }
}

public class Problem5 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of threads: ");
            int numOfThreads = sc.nextInt();
            System.out.println("Increment Per thread?: ");
            int incrementPerThread = sc.nextInt();

            Counter counter = new Counter();

            myThread[] threads = new myThread[numOfThreads];

            for (int i = 0; i < numOfThreads; i++) {
                threads[i] = new myThread(counter, incrementPerThread);
                threads[i].start();
            }

            for (myThread thread : threads) {
                thread.join();
            }
            System.out.println("Final Count: " + counter.getCount());
        } catch (Exception e) {
            System.out.println(e);
            ;
        }
    }
}