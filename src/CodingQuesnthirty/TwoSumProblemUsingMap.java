package CodingQuesnthirty;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumProblemUsingMap {
    //find the Input: nums = [2,7,11,15], target = 9
    //Output: [0,1]

    public static void main(String[] args) {


        int[] nums = {2, 7, 11, 15};
        int target = 9;
        Map<Integer, Integer> map = new HashMap<>();
        int complement = 0;
        for (int i = 0; i < nums.length; i++) {

            complement = target - nums[i];

            if (map.containsKey(complement)) {

                int arr[] = {map.get(complement), i};
                System.out.println(Arrays.toString(arr));

            } else {
                map.put(nums[i], i);
            }

        }
    }


}
