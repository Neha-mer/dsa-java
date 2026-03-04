package ConcurrencyAndMultiThreading;

import org.w3c.dom.ls.LSOutput;

import java.util.concurrent.atomic.AtomicInteger;

public class RaceCondition {
    // static AtomicInteger count = new AtomicInteger(0);
    static volatile int count = 0;

    public static void main(String[] args) {


        Thread t1 = new Thread(() -> {
            for (int i = 0; i <= 100000; i++) {
                synchronized (RaceCondition.class) {
                    //  count.incrementAndGet();
                    count++;
                }
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("count t1   " + count);
        });


        Thread t2 = new Thread(() -> {
            for (int i = 0; i <= 100000; i++) {
                synchronized (RaceCondition.class) {
                    //  count.incrementAndGet();
                    count++;
                }
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("count t2   " + count);
        });

        t1.start();
        t2.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Final count: " + count);
    }


}
