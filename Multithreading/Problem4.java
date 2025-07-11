//Write a Java program to create multiple threads that increment a shared counter using AtomicInteger for thread-safe operations.

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

class myThread extends Thread {

    Counter counter;
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
    private AtomicInteger count = new AtomicInteger(0);

    public void increment() {
        count.incrementAndGet();
    }

    public int getCount() {
        return count.get();
    }

}

public class Problem4 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the no of thread: ");
            int noOfThread = sc.nextInt();
            System.out.println("Enter increment per thread?");
            int incrementPerThread = sc.nextInt();

            Counter counter = new Counter();
            myThread[] thread = new myThread[noOfThread];

            for (int i = 0; i < noOfThread; i++) {
                thread[i] = new myThread(counter, incrementPerThread);
                thread[i].start();
            }

            // Wait for all threads to finish
            for (myThread t : thread) {
                t.join();
            }

            // Print final count
            System.out.println("Final Count: " + counter.getCount());

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}