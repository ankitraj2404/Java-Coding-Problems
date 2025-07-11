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

    synchronized public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

public class Problem3 {
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