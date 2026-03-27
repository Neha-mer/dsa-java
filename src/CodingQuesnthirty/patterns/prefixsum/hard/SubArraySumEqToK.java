package CodingQuesnthirty.patterns.prefixsum.hard;

import java.util.HashMap;
import java.util.Map;

public class SubArraySumEqToK {
    //Given an array of integers nums and an integer k, find the total number of continuous subarrays whose sum equals k.
    public static void main(String[] args) {
        //Input: nums = [1, 1, 1], k = 2 asked in google
        // Output: 2
        //main key tagregtsum(l,r)=sum(r)-sum(l-1);
        //k=sum(r)-needtocheckifthis is prsent
        //needtocheckifthis is prsent=sum(r)-k
        int[] arr = {1, 1, 1, 1};
        int k = 2;
        int prefixSum = 0;
        int count = 0;
        Map<Integer, Integer> hmap = new HashMap<>();
        hmap.put(0, 1);
        for (int i = 0; i <= arr.length - 1; i++) {
            //1,1,1,1,1
            //0+1 wheni=1, summ=0

            prefixSum = prefixSum + arr[i];
            System.out.println("sum" + prefixSum + " is" + i);

            if (hmap.containsKey(prefixSum - k)) {
                //2
                //2:1
                count = count + hmap.get(prefixSum - k);
            }
            hmap.put(prefixSum, hmap.getOrDefault(prefixSum, 0) + 1);

        }
        System.out.println(count);
    }
}
