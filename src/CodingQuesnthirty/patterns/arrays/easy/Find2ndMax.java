package CodingQuesnthirty.patterns.arrays.easy;

import java.security.cert.CollectionCertStoreParameters;
import java.util.Arrays;
import java.util.Collections;

public class Find2ndMax {

    // Find the second largest element in an array.
    static void main() {


        int[] arr = {3, 5, 11, 1, 2, 3, 0, 34, 56, -5, -6, -10};

        // Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        int max = 0;
        while (left < right) {

            if (arr[left] < arr[left + 1]) {
                max = Math.max(arr[left], arr[left + 1]);

            }
            left++;
        }
        System.out.println(max);
        int maxfromsorted = arr[arr.length - 1];
        int secondMax = arr[arr.length - 2];

        //  System.out.println(secondMax);

    }
}
