package com.deetree.amazon.medium;

/*
Given a 2d grid map of '1's (land) and '0's (water),
count the number of islands. An island is surrounded by water and is
formed by connecting adjacent lands horizontally or vertically.
You may assume all four edges of the grid are all surrounded by water.

Example 1:

Input:
11110
11010
11000
00000

Output: 1
Example 2:

Input:
11000
11000
00100
00011

Output: 3
 */
public class NumberOfIslands {

    public static void main(String[] main) {
        char[][] arr1 = {
                {'1', '0', '0'},
                {'1', '0', '1'},
                {'1', '0', '0'}
        };

        char[][] arr2 = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };


        char[][] arr3 = {
                {'1'},
                {'1'}
        };


        char[][] arr = {
                {'0', '1', '1', '0', '0', '0', '0', '0'},
                {'1', '0', '1', '0', '0', '0', '0', '0'},
                {'1', '1', '0', '0', '0', '0', '0', '0'},
                {'0', '0', '0', '0', '0', '0', '0', '0'},
                {'0', '0', '0', '0', '0', '0', '0', '0'},
                {'0', '0', '0', '0', '0', '0', '0', '0'},
                {'0', '0', '0', '0', '0', '0', '1', '1'},
                {'0', '0', '0', '0', '0', '0', '0', '0'}

        };


        NumberOfIslands iland = new NumberOfIslands();

        System.out.println(iland.numIslands(arr));
    }

    public int numIslands(char[][] grid) {

        if (grid.length == 0 || grid[0].length == 0)
            return 0;

        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    count += DFSGrid(grid, i, j);
                }
            }
        }


        return count;

    }

    private int DFSGrid(char[][] grid, int i, int j) {

        if (i < 0 || j < 0 || i > grid.length - 1 || j > grid[i].length - 1 || grid[i][j] != '1')
            return 0;

        grid[i][j] = '0';
        DFSGrid(grid, i + 1, j); // row up
        DFSGrid(grid, i, j + 1); // col next
        DFSGrid(grid, i - 1, j); //row down
        DFSGrid(grid, i, j - 1); // col prev

        return 1;
    }
}
