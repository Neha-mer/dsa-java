package CodingQuesnthirty.revision;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {


    public static void main(String[] args) {

        int[] arr = {2, 7, 11, 15};
        int target = 9;
        int[] newArr = new int[2];
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            if (arr[left] + arr[right] == target) {

                newArr[0] = left;
                newArr[1] = right;
                break;
            } else if (arr[left] + arr[right] > target) {
                right--;
            } else if (arr[left] + arr[right] < target) {
                left++;
            }
        }

        System.out.println(Arrays.toString(newArr));
    }
}