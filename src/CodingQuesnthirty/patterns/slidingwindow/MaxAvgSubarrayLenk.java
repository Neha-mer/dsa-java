package CodingQuesnthirty.patterns.slidingwindow;

public class MaxAvgSubarrayLenk {
    //An array of numbers: [1, 12, -5, -6, 50, 3]
    //A number k = 4
    // Task: Find the maximum average of any subarray of length k.
    //  Subarray = continuous segment of length k.
    //  Example: For length 4, the first subarray is [1, 12, -5, -6]

    public static void main(String[] args) {
        int[] arr = {1, 12, -5, -6, 50, 3};
        int len = 4;
        int sum = 0;
        if (arr == null || arr.length < len || len <= 0) {
            throw new IllegalArgumentException("Invalid input");
        }
        for (int i = 0; i < len; i++) {
            sum = sum + arr[i];
        }
        //slide the window
        int maxSum = sum;
        for (int j = len; j < arr.length; j++) {
            sum = sum + arr[j] - arr[j - len];
            System.out.println("sum" + sum);

            maxSum = Math.max(sum, maxSum);
            System.out.println("maxSum" + maxSum);
        }


        System.out.println("maxavge" + (maxSum / len));
    }
}
