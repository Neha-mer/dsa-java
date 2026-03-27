package ConcurrencyAndMultiThreading;

public class VirtualThreadExmp {

    public static void main(String[] args) {

        Runnable r = new Runnable() {
            @Override
            public void run() {

                for (int i = 0; i < 10; i++) {
                    System.out.println(i);
                }
            }
        };

        //Thread vth = Thread.ofVirtual().start();
    }
}
