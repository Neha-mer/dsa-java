package GenzCodingQuesns;

import java.util.Arrays;

public class FibonnaciSeries {
    static void main() {
        int n = 10;
        int[] arr = new int[n];
        //0,1,2,3,4,5
        //1
        //1+1
        arr[0] = 0;
        arr[1] = 1;
        //fibonnaci series 1,1,2,3,5
        int sum = 0;
        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        System.out.println(Arrays.toString(arr));
    }
}
