package JavaMultithreading.ReentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTestClass {

    ReentrantLock lock = new ReentrantLock();
    int count = 0;

    public void testMethod() {
        count++;
        try {
            lock.lock();
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {


    }

}
