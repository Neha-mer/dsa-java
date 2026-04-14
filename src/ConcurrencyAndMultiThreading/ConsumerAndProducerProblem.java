package ConcurrencyAndMultiThreading;

import java.nio.channels.ScatteringByteChannel;
import java.util.LinkedList;
import java.util.Queue;

public class ConsumerAndProducerProblem {


    //one thread produce
    //if the cosumer id empty producer prodecues else wait
    //if  the producer is empty cobsumer wwait
    int capacity;

    ConsumerAndProducerProblem(int capacity) {
        this.capacity = capacity;
    }

    Queue<Integer> queue = new LinkedList<>();

    synchronized void producer(Integer value) {
        while (queue.size() == capacity) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        queue.add(value);
        notifyAll();
    }

    synchronized void consumer(Integer value) {

        while (queue.size() == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        queue.poll();
        notifyAll();
        ;
    }

    public static void main(String[] args) {
        ConsumerAndProducerProblem consumerAndProducerProblem = new ConsumerAndProducerProblem(10);
        Thread producerThread = new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) {
                    consumerAndProducerProblem.producer(i);

                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        // CONSUMER THREAD
        Thread consumerThread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                consumerAndProducerProblem.consumer(i);
                try {
                    Thread.sleep(800);
                } catch (Exception ignored) {
                }
            }
        });

        producerThread.start();
        consumerThread.start();

    }
}