/*
Container With Most Water
Solution
Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai).
n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0).
Find two lines, which together with x-axis forms a container, such that the container contains the most water.

Note: You may not slant the container and n is at least 2.





The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7].
In this case, the max area of water (blue section) the container can contain is 49.



Example:

Input: [1,8,6,2,5,4,8,3,7]
Output: 49
 */
package com.deetree.leetcode.editor.en;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Container_With_Most_Water_Solution {


    public static void main(String[] args) {
        int ans = maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7});
    }

    public static int maxArea(int[] height) {

        int low = 0, high = height.length - 1, heightOfTheContainer = 0, widthOfTheContainer = 0, ans = 0;

        while (low < high) {
            heightOfTheContainer = Math.min(height[low], height[high]);
            widthOfTheContainer = high - low;
            ans = Math.max(ans, (heightOfTheContainer * widthOfTheContainer));

            if (height[low] < height[high]) {
                low++;
            } else
                high--;

        }
        return ans;
    }

}
