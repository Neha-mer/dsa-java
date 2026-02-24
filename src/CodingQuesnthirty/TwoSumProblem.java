package CodingQuesnthirty;

import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem {

    //find the Input: nums = [2,7,11,15], target = 9
    //Output: [0,1]


    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int left = 0;
        int right = nums.length - 1;
        while (left < right) {

            if (nums[left] + nums[right] == target) {
                System.out.println(left + " " + right);

                break;

            } else if (nums[left] + nums[right] > target) {
                right--;
            } else {
                left++;
            }
        }
    }
}
