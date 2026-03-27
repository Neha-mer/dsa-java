package CodingQuesnthirty;

import java.util.Arrays;

public class Sortquesn {

    static void main() {
        int[] nums = {2, 0, 2, 1, 1, 0};
        ///n objects
        //colr-red, white,blue

        //sort
        //red red. blue blue. white wite

        //let's try using two pointers
        int left = 0;
        int right = nums.length - 1;
        int count0 = 0, count1 = 0, count2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count0++;
                System.out.println(count0);
            } else if (nums[i] == 1) {
                count1++;
            } else if (nums[i] == 2) {
                count2++;
            }


        }
        int index = 0;
        for (int i = 0; i < count0; i++) {

            nums[i] = 0;
            System.out.println(i + "and the arrays us" + nums[i]);

            index++;
            System.out.println("idnex is" + " " + index);
        }
        for (int i = 0; i < count1; i++) {
            // System.out.println(index);
            nums[index] = 1;
            // System.out.println(nums[i]);
            index++;
        }
        for (int i = 0; i < count2; i++) {
            nums[index] = 2;
            //  System.out.println(nums[i]);
            index++;
        }

        System.out.println(Arrays.toString(nums));
    }

}

