/*
Median of Two Sorted Arrays
==================================
There are two sorted arrays nums1 and nums2 of size m and n respectively.

Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

You may assume nums1 and nums2 cannot be both empty.

Example 1:

nums1 = [1, 3]
nums2 = [2]

The median is 2.0
Example 2:

nums1 = [1, 2]
nums2 = [3, 4]

The median is (2 + 3)/2 = 2.5

*/

package com.deetree.misc;

public class Median_of_Two_Sorted_Arrays {


    public static void main(String[] args) {
        double result = findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4});

    }


    /*
    Solution 1 : Implemented semi-merge sort.
     */
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {


        int rightLength = nums1.length;
        int leftLength = nums2.length;

        int[] sortedArray = new int[rightLength + leftLength];
        int i = 0, j = 0, k = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j])
                sortedArray[k++] = nums1[i++];
            else
                sortedArray[k++] = nums2[j++];
        }

        while (i < nums1.length) {
            sortedArray[k++] = nums1[i++];
        }

        while (j < nums2.length) {
            sortedArray[k++] = nums2[j++];
        }

        if (sortedArray.length % 2 == 0) {

            int leftElement = sortedArray.length / 2;
            int lelement = sortedArray[leftElement - 1];
            int relement = sortedArray[leftElement];

            return (double) (sortedArray[(sortedArray.length / 2) - 1] + sortedArray[(sortedArray.length / 2)]) / 2;
        } else
            return (double) sortedArray[sortedArray.length / 2];


    }
}
