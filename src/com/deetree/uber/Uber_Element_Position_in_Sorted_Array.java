/*
Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.

Your algorithm's runtime complexity must be in the order of O(log n).

If the target is not found in the array, return [-1, -1].

Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
 */
package com.deetree.uber;

public class Uber_Element_Position_in_Sorted_Array {

    public static void main(String[] args) {
        Uber_Element_Position_in_Sorted_Array p = new Uber_Element_Position_in_Sorted_Array();
        int[] result = p.searchRange_solution_3(new int[]{5, 7, 7, 8, 8, 10}, 8);

        for (int i : result) {
            System.out.println(i);
        }

    }


    public int[] searchRange_solution_3(int[] nums, int target) {

        int low = -1;
        int high = nums.length - 1;
        int[] result = {-1, -1};
        while (low < high) {
            if (nums[low] != target)
                low++;

            if (nums[high] != target)
                high++;


        }

        return result;
    }

    public int[] searchRange_solution_2(int[] nums, int target) {

        int[] result = {-1, -1};

        int first = -1;
        int second = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (first == -1) {
                    first = i;
                    second = i;
                } else
                    second++;
            }
        }
        result[0] = first;
        result[1] = second;
        return result;
    }

    /*
    This is not a very efficient approach to solve this problem.
     */
    public int[] searchRange_solution_1(int[] nums, int target) {
        int front = 0;
        int back = nums.length - 1;
        int[] result = {-1, -1};

        while (front < nums.length) {
            if (nums[front] == target) {
                result[0] = front;
                break;
            }

            front++;
        }

        while (back >= front) {
            if (nums[back] == target) {
                result[1] = back;
                break;
            }


            back--;
        }

        return result;
    }
}
