package com.deetree;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class MinCostToConnectRopes {

    public static void main(String[] args) {
        int[] ropesLength = {2, 4, 3};

        System.out.println(ConnectSticks(ropesLength));

        List<Integer> test = new ArrayList<>();
        test.add(1);

        //int a = test.get


    }

    private static int ConnectSticks(int[] ropes) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int r : ropes) {
            pq.offer(r);
        }
        int sum = 0;
        while (pq.size() > 1) {
            int two = pq.poll() + pq.poll();
            sum += two;
            pq.offer(two);
        }

        return sum;
    }


}
