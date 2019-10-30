package com.deetree;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Squares_of_a_Sorted_Array {

    public static void main(String[] args) {


    }

    //Actually this is not a good solution
    //but to begin with , we can still live with this solution.
    //I will suggest to square negative and positive number separately and then merge them and sort.
    public int[] sortedSquares(int[] A) {

        List<Integer> result = new LinkedList<>();

        for (int i : A) {
            result.add(i * i);
        }

        int[] array = result.stream().mapToInt(Integer::intValue).toArray();

        Arrays.sort(array);

        return array;

    }
}
