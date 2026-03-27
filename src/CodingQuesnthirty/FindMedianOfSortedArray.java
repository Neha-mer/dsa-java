package CodingQuesnthirty;

import java.util.Arrays;

public class FindMedianOfSortedArray {


    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {5, 6, 7, 8};

        double med = findMedianSortedArrays(nums1, nums2);
        System.out.println(med);
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        //median if odd numbers get the middle one
        //if even get the sum of the middle two values divide by 2


        int[] mergedArray = new int[nums1.length + nums2.length];

        int z = nums1.length + nums2.length;

        int k = 0;
        for (int i = 0; i <= nums1.length - 1; i++) {
            mergedArray[k] = nums1[i];
            k++;


        }


        for (int i = 0; i <= nums2.length - 1; i++) {

            mergedArray[k] = nums2[i];
            k++;
            System.out.println(k);
        }

        System.out.println("mergedArray = " + Arrays.toString(mergedArray));

        Arrays.sort(mergedArray);

        double median = 0;
        int lengthofMergedArray = mergedArray.length;
        if (lengthofMergedArray % 2 == 0) {
            int a = lengthofMergedArray / 2;
            int b = a - 1;
            System.out.println(mergedArray[a]);
            System.out.println(mergedArray[b]);

            return (double) (mergedArray[a] + mergedArray[b]) / 2;
        } else {
            return (double) mergedArray[lengthofMergedArray / 2];
        }

    }
}