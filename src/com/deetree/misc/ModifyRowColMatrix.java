package com.deetree.misc;

/*
Given a boolean matrix mat[M][N] of size M x N,
modify it such that if a matrix cell mat[i][j] is 1 (or true) then make all the cells of ith row and jth column as 1.
Example 1
The matrix
1 0
0 0
should be changed to following
1 1
1 0

Example 2
The matrix
0 0 0
0 0 1
should be changed to following
0 0 1
1 1 1

Example 3
The matrix
1 0 0 1
0 0 1 0
0 0 0 0
should be changed to following
1 1 1 1
1 1 1 1
1 0 1 1

 */

public class ModifyRowColMatrix {

    public static void main(String[] args) {
        int[][] arr2 = {
                {0, 0, 0},
                {0, 0, 1}
        };

        int[][] arr3 = {

                {1, 0, 0, 1},
                {0, 0, 1, 0},
                {0, 0, 0, 0}
        };

        int[][] arr = {

                {1, 0},
                {0, 0}

        };

        boolean[][] visited = new boolean[arr.length][arr[0].length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] == 1 && !visited[i][j]) {
                    int col = arr[i].length - 1;
                    while (col >= 0) {
                        if (arr[i][col] != 1) {
                            arr[i][col] = 1;
                            visited[i][col] = true;
                        }
                        col--;
                    }
                    int row = arr.length - 1;
                    while (row >= 0) {

                        if (arr[row][j] != 1) {
                            arr[row][j] = 1;
                            visited[row][j] = true;
                        }
                        row--;
                    }
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }

}
