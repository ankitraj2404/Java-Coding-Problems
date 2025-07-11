//Write a Java program to implement multiple threads that increment a shared counter and use a CountDownLatch to wait for all threads to finish.

import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

class Counter {

    private int count = 0;

    synchronized public void increment() {
        count++;

    }

    public int getCount() {
        return count;
    }
}

class incrementCounter extends Thread {
    private CountDownLatch latch;
    private Counter counter;
    private int increments;

    public incrementCounter(Counter counter, CountDownLatch latch, int increments, String name) {
        super(name);
        this.counter = counter;
        this.latch = latch;
        this.increments = increments;
    }

    @Override
    public void run() {
        for (int i = 1; i <= increments; i++) {
            System.out.println(getName() + " incrementing counter");
            counter.increment();
        }
        latch.countDown();
    }

}

public class Problem6 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of threads: ");
            int noOfThread = sc.nextInt();
            System.out.println("Enter no of increment per thread: ");
            int increment = sc.nextInt();
            CountDownLatch latch = new CountDownLatch(noOfThread);
            Counter counter = new Counter();

            for (int i = 1; i <= noOfThread; i++) {
                String name = "Worker Thread" + i;
                Thread t = new incrementCounter(counter, latch, increment, name);
                t.start();
            }
            // Main thread waits for all worker threads to finish
            latch.await();

            // After all threads finished incrementing
            System.out.println("All threads finished. Final counter value: " + counter.getCount());

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
