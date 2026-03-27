package CodingQuesnthirty.patterns.arrays.easy;

import java.util.Arrays;

public class FindMax {
    //{3,5,11,1,2,3}
    //max=34


    public static void main(String[] args) {
        int[] arr = {3, 5, 11, 1, 2, 3, 0, 34, 56, -5, -6, -10};
        int max = arr[0];
        int min = arr[0];
       /* Arrays.sort(arr);
        int max = arr[arr.length - 1];
        int min = arr[0];

        System.out.println(min + " and " + max);*/

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min)

                min = arr[i];


        }
        System.out.println(max);
        System.out.println(min);
    }


}

