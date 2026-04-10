package CodingQuesnthirty.arrays;

import java.util.Arrays;

public class NextPermutation {


    static void main() {

        int[] nums = new int[]{1, 2, 3, 5, 4};

        int[] arr = new int[1];
        int pivot = -1;
        int right = nums.length - 1;
        for (int i = nums.length - 2; i >= 0; i--) {

            if (nums[i] < nums[i + 1]) {
                pivot = i;
                System.out.println(pivot);
                break;
            }

        }

        if (pivot == -1) {
            int i = 0;
            int j = nums.length - 1;
            while (i <= j) {

                int temp = nums[j];
                nums[i] = temp;
                nums[j] = nums[i];
                System.out.println("reverese" + temp);
                System.out.println("reverese" + nums[i]);
                System.out.println("reverese" + nums[j]);
                i++;
                j--;
            }
            return;
        }

        int temp = nums[right];
        nums[right] = nums[pivot];
        nums[pivot] = temp;


        int i = pivot + 1;
        int j = right;

        System.out.println(i + "" + j);

        while (i < j) {
            
            temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;

            i++;
            j--;
        }

        System.out.println(Arrays.toString(nums));
    }
}



