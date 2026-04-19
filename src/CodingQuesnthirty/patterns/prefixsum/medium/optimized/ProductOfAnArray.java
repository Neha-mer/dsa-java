package CodingQuesnthirty.patterns.prefixsum.medium.optimized;

import java.awt.color.ColorSpace;

public class ProductOfAnArray {

    static void main() {

        //Time Complexity-o(n)
        //sapace Complexity=o(1)
        int[] nums = {1, 2, 3, 4};
        int[] ans = new int[nums.length];
        ans[0] = 1;
        //prefix product
        for (int i = 1; i < nums.length; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }
        int suffix = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            suffix = suffix * nums[i + 1];

            ans[i] = ans[i] * suffix;
        }

        for (Integer i : ans) {
            System.out.println(i);
        }
    }
}

