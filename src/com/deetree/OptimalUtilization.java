package com.deetree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OptimalUtilization {

    public static void main(String[] args) {
        OptimalUtilization o = new OptimalUtilization();
        List<int[]> a = new ArrayList<int[]>();
        int[] a1 = {1, 3};
        int[] a2 = {2, 5};
        int[] a3 = {3, 7};
        int[] a4 = {4, 10};
        a.add(a1);
        a.add(a2);
        a.add(a3);
        a.add(a4);

        List<int[]> b = new ArrayList<int[]>();
        int[] b1 = {1, 2};
        int[] b2 = {2, 3};
        int[] b3 = {3, 4};
        int[] b4 = {4, 5};
        b.add(b1);
        b.add(b2);
        b.add(b3);
        b.add(b4);

        for (int[] r : o.getPairs(a, b, 10)) {
            for (int ans : r) {
                System.out.println(ans);
            }
            System.out.println("========");
        }


    }


    private List<int[]> getPairs(List<int[]> a, List<int[]> b, int target) {
        Collections.sort(a, (i, j) -> i[1] - j[1]);
        Collections.sort(b, (i, j) -> i[1] - j[1]);
        List<int[]> result = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        int m = a.size();
        int n = b.size();
        int i = 0;
        int j = n - 1;
        while (i < m && j >= 0) {
            int sum = a.get(i)[1] + b.get(j)[1];
            if (sum > target) {
                --j;
            } else {
                if (max <= sum) {
                    if (max < sum) {
                        max = sum;
                        result.clear();
                    }
                    result.add(new int[]{a.get(i)[0], b.get(j)[0]});
                    int index = j - 1;
                    while (index >= 0 && b.get(index)[1] == b.get(index + 1)[1]) {
                        result.add(new int[]{a.get(i)[0], b.get(index--)[0]});
                    }
                }
                ++i;
            }
        }
        return result;
    }


}
