package com.deetree.misc;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/*
Minimum Meeting rooms required give meeting schedule
[[1, 2], [3,5 ], [4,5], [5,7]]

Ans - 2

 */
public class MinimumMeetingRooms {

    public static void main(String[] args) {


        int[][] array = {
                {13, 15},
                {1, 13},
                {6, 9}
        };

        MinimumMeetingRooms rooms = new MinimumMeetingRooms();
        System.out.println(rooms.minMeetingRooms(array));
    }


    public int minMeetingRooms(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt((int[] itv) -> itv[0]));

        PriorityQueue<Integer> heap = new PriorityQueue<>();

        int count = 0;

        for (int[] time : intervals) {


            if (!heap.isEmpty() && time[0] >= heap.peek())
                heap.poll();

            heap.offer(time[1]);

            count = heap.size();

        }
        return count;
    }


}
/*
Complexity Analysis

Time Complexity: O(N log N )

Sorting O(N log N)
Heap extract operation : O(log N)
*/