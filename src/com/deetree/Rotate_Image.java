/*
Rotate Image
==================================
You are given an n x n 2D matrix representing an image.

Rotate the image by 90 degrees (clockwise).

Note:

You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.

Example 1:
==================
Given input matrix =
[
  [1,2,3],
  [4,5,6],
  [7,8,9]
],

rotate the input matrix in-place such that it becomes:
[
  [7,4,1],
  [8,5,2],
  [9,6,3]
]

Example 2:
===================
Given input matrix =
[
  [ 5, 1, 9,11],
  [ 2, 4, 8,10],
  [13, 3, 6, 7],
  [15,14,12,16]
],

rotate the input matrix in-place such that it becomes:
[
  [15,13, 2, 5],
  [14, 3, 4, 1],
  [12, 6, 8, 9],
  [16, 7,10,11]
]
 */
package com.deetree;

public class Rotate_Image {

    public static void main(String[] args) {
        int[][] arr = new int[][]{

                {5, 1, 9, 11},
                {2, 4, 8, 10},
                {13, 3, 6, 7},
                {15, 14, 12, 16}

        };

        int[][] arr1 = new int[][]{

                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}

        };
        rotate(arr);
    }

    public static void rotate(int[][] matrix) {

        int[][] transpose = new int[matrix.length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                transpose[i][j] = matrix[j][i];

            }
        }

        for (int i = 0; i < transpose.length; i++) {
            int low = 0;
            int high = transpose[low].length - 1;

            while (low < high) {
                int temp = transpose[i][high];
                transpose[i][high] = transpose[i][low];
                transpose[i][low] = temp;

                low++;
                high--;
            }
        }

        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[0].length; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
