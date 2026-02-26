package CodingQuesnthirty;

import java.util.Arrays;

public class FIndMissingNumber {

    //Input: arr[] = {6, 7, 10, 11, 13}
    //Output: 8 9 12

    public static void main(String[] args) {

        int arr[] = {6, 7, 7, 8, 10, 11, 13, 20, 24};
        int newArr[];
        Arrays.sort(arr);
        int left;
        int right;

        for (int i = 0; i < arr.length - 1; i++) {

            left = arr[i];
            right = arr[i + 1];
            if (left == right) {
                continue;
            }
            if (arr == null || arr.length < 2)
                return;

            if (right - left > 1) {
                int difference = right - left;//3

                for (int z = 0; z < difference - 1; z++) {
                    int missingNum = left + 1;
                    left++;
                    Arrays.asList(missingNum).forEach(n -> System.out.print(n + " "));

                }
            } else {
                left++;
                right++;
            }
        }

    }
}
