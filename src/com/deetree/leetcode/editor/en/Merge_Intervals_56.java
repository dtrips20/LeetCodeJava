/*
56. Merge Intervals
====================

Medium
=======

Given a collection of intervals, merge all overlapping intervals.

Example 1:
======================================
Input: [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].

Example 2:
======================================
Input: [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considered overlapping.
NOTE: input types have been changed on April 15, 2019. Please reset to default code definition to get new method signature.

 */

package com.deetree.leetcode.editor.en;


import java.util.*;

public class Merge_Intervals_56 {

    public static void main(String[] args) {
        Merge_Intervals_56 merge = new Merge_Intervals_56();
        int[][] ans = merge.merge(new int[][]{{1, 4}, {0, 2} , { 3,5}});
    }


    public int[][] merge(int[][] intervals) {

        if ( intervals.length <= 1)
            return intervals;

        Arrays.sort(intervals, Comparator.comparingInt((int[] itv) -> itv[0]));

        //PriorityQueue<Integer> queue = new PriorityQueue<>();
        List<int[]> result = new ArrayList<>();
        int[] oldInterval = intervals[0];
        result.add(oldInterval);
        int index = 0 ;
        for (int[] intv : intervals) {

            if ( intv[0] <= oldInterval[1])
            {
                oldInterval[1] = Math.max(intv[1] , oldInterval[1]);
            }
            else
            {
                oldInterval = intv;
                result.add(oldInterval);
            }


        }

        int[][] intResult = new int[result.size()][2];
        int count = 0 ;
        for( int[] ls : result)
        {
            intResult[count][0] = ls[0];
            intResult[count++][1] = ls[1];
        }


        return intResult;

    }
}