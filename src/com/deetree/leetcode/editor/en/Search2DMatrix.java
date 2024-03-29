package com.deetree.leetcode.editor.en;
/*
Search a 2D Matrix II
====================================================
Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:

Integers in each row are sorted in ascending from left to right.
Integers in each column are sorted in ascending from top to bottom.
Example:

Consider the following matrix:

[
  [1,   4,  7, 11, 15],
  [2,   5,  8, 12, 19],
  [3,   6,  9, 16, 22],
  [10, 13, 14, 17, 24],
  [18, 21, 23, 26, 30]
]
Given target = 5, return true.

Given target = 20, return false.
 */

public class Search2DMatrix {

    public static void main(String[] args) {
        int[][] arr = {
                {
                        1, 4, 7, 11, 15
                },
                {
                        2, 5, 8, 12, 19
                },
                {
                        3, 6, 9, 16, 22
                },
                {
                        10, 13, 14, 17, 24
                },
                {
                        18, 21, 23, 26, 30
                }
        };


        Search2DMatrix search = new Search2DMatrix();
        System.out.println(search.searchMatrix(arr, 5));
    }

    /*
     * This is brute force method to solve the problem
     * */
    public boolean searchMatrix_brute_force(int[][] matrix, int target) {

        for (int i = 0; i <= matrix.length - 1; i++) {
            for (int j = 0; j <= matrix[0].length - 1; j++) {

                if (matrix[i][j] == target) {
                    return true;
                }

            }
        }

        return false;

    }

    /*
      Complexity Analysis
      Time complexity : O(n+m)
      Space complexity : 0(1)
      Because this approach only manipulates a few pointers, its memory footprint is constant.
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length < 1 || matrix[0].length < 1)
            return false;

        int row = 0;
        int col = matrix[0].length - 1;

        while (row <= matrix.length - 1 && col >= 0) {
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] < target) {
                row++;
            } else if (matrix[row][col] > target) {
                col--;
            }

        }
        return false;
    }
}
