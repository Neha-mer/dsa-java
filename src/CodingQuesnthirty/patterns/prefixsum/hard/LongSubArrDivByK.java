package CodingQuesnthirty.patterns.prefixsum.hard;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LongSubArrDivByK {

    //Asked in google
    //Given an array of integers nums and an integer k, find the length of the longest subarray whose sum is divisible by k.
    // Input: nums = [2, 7, 6, 1, 4, 5], k = 3
    //prefix=[2,9,15,16,19,24]
    //5-0+1=6
    //  Output: 4
    //  Explanation: The subarray [7, 6, 1, 4] has sum 18, which is divisible by 3.
//sum{l,r)/3=prefixsum(right)-prefixsum(left-1)
    //sum(l,r)=(prefix(right)-prefix(left-1)/3

    public static void main(String[] args) {
        int[] nums = {2, 7, 6, 1, 4, 5};
        int prefix[] = new int[nums.length];
        int k = 3;
        int sum = 0;
        int count = 0;
        prefix[0] = nums[0];
        //prefix[1]=nums[1];
        int[] newArr = new int[nums.length];
        sum = nums[0] + nums[1];
        int len = 0;
        int left = 0;
        int right = 0;


        // build prefix array
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
            System.out.println(prefix[i]);
        }

        Map<Integer, Integer> modIndexMap = new HashMap<>();
        modIndexMap.put(0, -1); // handle subarrays starting at index 0
        int maxLength = 0;

        for (int i = 0; i < nums.length; i++) {
            int mod = ((prefix[i] % k) + k) % k;

            if (modIndexMap.containsKey(mod)) {
                maxLength = Math.max(maxLength, i - modIndexMap.get(mod));
            } else {
                modIndexMap.put(mod, i);
            }
        }

        System.out.println(maxLength); // Output: 4


    }
}
