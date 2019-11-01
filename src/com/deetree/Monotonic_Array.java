/*
896. Monotonic Array
=====================
Easy
=====================
An array is monotonic if it is either monotone increasing or monotone decreasing.

An array A is monotone increasing if for all i <= j, A[i] <= A[j].  An array A is monotone decreasing if for all i <= j, A[i] >= A[j].

Return true if and only if the given array A is monotonic.



Example 1:
==================
Input: [1,2,2,3]
Output: true

Example 2:
=================
Input: [6,5,4,4]
Output: true

Example 3:
=================
Input: [1,3,2]
Output: false

Example 4:
=================
Input: [1,2,4,5]
Output: true

Example 5:
================
Input: [1,1,1]
Output: true


Note:

1 <= A.length <= 50000
-100000 <= A[i] <= 100000
 */
package com.deetree;

public class Monotonic_Array {

    public static void main(String[] args) {

        Monotonic_Array array = new Monotonic_Array();
        boolean b = array.isMonotonic(new int[]{9, 9, 6, 4});
        System.out.println(b);

    }

    /*
     Complexity Analysis
     ====================================
     Time Complexity: O(N), where N is the length of A.

     Space Complexity: O(1).
     */
    public boolean isMonotonic(int[] A) {

        int sum = 0;
        int c = 0;
        for (int i = 0; i < A.length - 1; i++) {
            int com = Integer.compare(A[i], A[i + 1]);
            if (com != 0) {
                if (com != sum && sum != 0)
                    return false;

                sum = com;
            }
            //System.out.println(com);
        }

        return true;
    }
}


