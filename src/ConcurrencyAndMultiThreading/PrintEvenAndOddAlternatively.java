package ConcurrencyAndMultiThreading;

public class PrintEvenAndOddAlternatively {
    private int count = 1;
    private int MAX = 10;


    public synchronized void printOdd() {
        for (int i = 0; i < 5; i++) {
            while (count % 2 == 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                }
            }


            System.out.println(count++);
            notify();

        }
    }

    public synchronized void printEveven() {
        for (int i = 0; i < 5; i++) {
            while (count % 2 != 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                }

            }

            System.out.println(count++);
            notify();

        }
    }

    static void main() {

        PrintEvenAndOddAlternatively printEvenAndOddAlternatively = new PrintEvenAndOddAlternatively();
        Thread t1 = new Thread(printEvenAndOddAlternatively::printOdd);
        Thread t2 = new Thread(printEvenAndOddAlternatively::printEveven);
        t1.start();
        t2.start();
    }
}