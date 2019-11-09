package com.deetree.leetcode.editor.en;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OptimalUtilization {

    public static void main(String[] args) {

        OptimalUtilization o = new OptimalUtilization();
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(3000);

        List<Integer> l2 = new ArrayList<>();
        l2.add(2);
        l2.add(5000);

        List<Integer> l3 = new ArrayList<>();
        l3.add(3);
        l3.add(7000);


        List<Integer> l4 = new ArrayList<>();
        l4.add(4);
        l4.add(10000);

        List<List<Integer>> flist = new ArrayList<>();
        flist.add(l1);
        flist.add(l2);
        flist.add(l3);
        flist.add(l4);


        List<Integer> ll1 = new ArrayList<>();
        ll1.add(1);
        ll1.add(2000);

        List<Integer> ll2 = new ArrayList<>();
        ll2.add(2);
        ll2.add(3000);

        List<Integer> ll3 = new ArrayList<>();
        ll3.add(3);
        ll3.add(4000);


        List<Integer> ll4 = new ArrayList<>();
        ll4.add(4);
        ll4.add(5000);

        List<List<Integer>> blist = new ArrayList<>();
        blist.add(ll1);
        blist.add(ll2);
        blist.add(ll3);
        blist.add(ll4);


        List<List<Integer>> result = o.optimalUtilization(10000, flist, blist);


    }

    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    private List<List<Integer>> optimalUtilization(int maxTravelDist,
                                                   List<List<Integer>> forwardRouteList,
                                                   List<List<Integer>> returnRouteList) {

        List<List<Integer>> result = new ArrayList<>();

        forwardRouteList = forwardRouteList.stream().sorted((x1, x2) -> Integer.compare(x2.get(1), x1.get(1))).collect(Collectors.toList());

        returnRouteList = returnRouteList.stream().sorted((x1, x2) -> Integer.compare(x1.get(1), x2.get(1))).collect(Collectors.toList());


        int currentMaxDistance = 0;

        for (List<Integer> fRoute : forwardRouteList) {
            for (List<Integer> bRoute : returnRouteList) {
                int forward = fRoute.get(1);
                int backward = bRoute.get(1);

                int currentDistance = forward + backward;

                if (currentDistance > currentMaxDistance && currentDistance <= maxTravelDist) {
                    result.clear();

                    result.add(Arrays.asList(fRoute.get(0), bRoute.get(0)));
                    currentMaxDistance = currentDistance;
                    continue;
                }
                if (currentDistance == currentMaxDistance && currentDistance <= maxTravelDist) {
                    result.add(Arrays.asList(fRoute.get(0), bRoute.get(0)));

                }
                if (currentDistance > maxTravelDist) {
                    break;
                }
            }
        }
        return result;


        // WRITE YOUR CODE HERE
    }
}
