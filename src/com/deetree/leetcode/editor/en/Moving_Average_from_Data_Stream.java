/*
346. Moving Average from Data Stream
=====================================

Given a stream of integers and a window size, calculate the moving average of all integers in the sliding window.

Example:

MovingAverage m = new MovingAverage(3);
m.next(1) = 1
m.next(10) = (1 + 10) / 2
m.next(3) = (1 + 10 + 3) / 3
m.next(5) = (10 + 3 + 5) / 3


 */
package com.deetree.leetcode.editor.en;

import java.util.ArrayDeque;
import java.util.Deque;

class MovingAverage {

    Deque queue = new ArrayDeque<Integer>();
    int size = 0, windowSum = 0, count = 0;

    /**
     * Initialize your data structure here.
     */
    public MovingAverage(int size) {

        this.size = size;

    }

    public double next(int val) {

        count++;

        queue.add(val);

        int tail = 0;

        if (count > size) {
            tail = (int) queue.poll();
        } else {
            tail = 0;
        }

        windowSum = windowSum - tail + val;

        return windowSum * 1.0 / Math.min(size, count);


    }
}

/* *
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */