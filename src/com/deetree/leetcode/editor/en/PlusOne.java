//Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
//
// The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit. 
//
// You may assume the integer does not contain any leading zero, except the number 0 itself. 
//
// Example 1: 
//
// 
//Input: [1,2,3]
//Output: [1,2,4]
//Explanation: The array represents the integer 123.
// 
//
// Example 2: 
//
// 
//Input: [4,3,2,1]
//Output: [4,3,2,2]
//Explanation: The array represents the integer 4321.
// Related Topics Array

package com.deetree.leetcode.editor.en;

import java.util.ArrayList;
import java.util.List;

public class PlusOne {
    public static void main(String[] args) {
        Solution solution = new PlusOne().new Solution();

        solution.plusOne(new int[]{9,8,7,6,5,4,3,2,1,9});

    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] plusOne(int[] digits) {


            int n = digits.length ;

            for( int i = n-1 ; i >= 0 ; i--) {
                if (digits[i] < 9) {
                    digits[i] = digits[i] + 1;
                    return digits;
                }

                digits[i] = 0;
            }

            int[] newNumber = new int [n+1];
            newNumber[0] = 1;

            return newNumber;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}