package com.deetree;

/*

Question:
============================
You are on a flight and wanna watch two movies during this flight.
You are given List<Integer> movieDurations which includes all the movie durations.
You are also given the duration of the flight which is d in minutes.
Now, you need to pick two movies and the total duration of the two movies is less than or equal to (d - 30min).

Find the pair of movies with the longest total duration and return they indexes.
If multiple found, return the pair with the longest movie.

Example 1:
=============================
Input: movieDurations = [90, 85, 75, 60, 120, 150, 125], d = 250
Output: [0, 6]
Explanation: movieDurations[0] + movieDurations[6] = 90 + 125 = 215 is the maximum number within 220 (250min - 30min)



 */

import java.util.*;

public class MoviesOnFlight {

    public static void main(String[] args) {
        int[] array = {90, 85, 75, 60, 120, 150, 125};
        int d = 250;
        int target = 30;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            //assuming that durations are unique
            map.put(array[i], i);
        }

        Arrays.sort(array);

        int low = 0;
        int high = array.length - 1;
        int[] result = new int[]{-1, -1};
        int min = 0;

        while (low < high) {
            int sum = array[low] + array[high];
            if (sum < d - target) {
                min = Math.max(min, sum);
                result[0] = map.get(array[low]);
                result[1] = map.get(array[high]);
                low++;
            } else {
                high--;
            }

        }

        System.out.println("[" + result[0] + "," + result[1] + "]");

    }


}
