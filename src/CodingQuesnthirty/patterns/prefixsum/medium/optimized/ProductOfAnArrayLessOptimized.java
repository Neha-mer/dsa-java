package CodingQuesnthirty.patterns.prefixsum.medium.optimized;

public class ProductOfAnArrayLessOptimized {
    static void main() {

        //Time Complexity-o(n)
        //space Complexity=o(n)
        int[] nums = {1, 2, 3, 4};//
        int[] ans = new int[nums.length];
        int prefix[] = new int[nums.length];
        int suffix[] = new int[nums.length];//1,4,12,24
        prefix[0] = 1;
        suffix[nums.length - 1] = 1;
        //prefix product
        for (int i = 1; i < nums.length; i++) {

            prefix[i] = prefix[i - 1] * nums[i - 1];
        }

        for (int i = nums.length - 2; i >= 0; i--) {

            suffix[i] = suffix[i + 1] * nums[i + 1];
            System.out.println("suffix" + suffix[i]);

        }

        for (int i = 0; i < nums.length; i++) {

            ans[i] = prefix[i] * suffix[i];
        }


        for (Integer i : ans) {
            System.out.println(i);
        }
    }
}

