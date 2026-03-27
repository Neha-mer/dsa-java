package GenzCodingQuesns;

import java.util.Scanner;

public class PrimeNumer {


    public void primeNumber(int n) {
        boolean isPrime = true;
        if (n == 1) {
            isPrime = true;
        }

        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }

        }
        if (isPrime)
            System.out.println(n + " is prime number");
        else
            System.out.println(n + " is not prime number");
    }


    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PrimeNumer obj = new PrimeNumer();
        obj.primeNumber(n);
    }

}
