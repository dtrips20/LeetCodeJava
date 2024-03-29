//A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).
//
// The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below). 
//
// Now consider if some obstacles are added to the grids. How many unique paths would there be? 
//
// 
//
// An obstacle and empty space is marked as 1 and 0 respectively in the grid. 
//
// Note: m and n will be at most 100. 
//
// Example 1: 
//
// 
//Input:
//[
//  [0,0,0],
//  [0,1,0],
//  [0,0,0]
//]
//Output: 2
//Explanation:
//There is one obstacle in the middle of the 3x3 grid above.
//There are two ways to reach the bottom-right corner:
//1. Right -> Right -> Down -> Down
//2. Down -> Down -> Right -> Right
// 
// Related Topics Array Dynamic Programming

package com.deetree.leetcode.editor.en;

import java.util.*;

public class UniquePathsIi {
    public static void main(String[] args) {
        Solution solution = new UniquePathsIi().new Solution();

        int[][] run = new int[][]{
            {0,0,0},
            {0,1,0},
            {0,0,0},
        };

        System.out.println(solution.uniquePathsWithObstacles(run));
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int uniquePathsWithObstacles(int[][] obstacleGrid) {

            int row = obstacleGrid.length;
            int col = obstacleGrid[0].length;

            if ( obstacleGrid[0][0] == 1)
                return 0;

            obstacleGrid[0][0] = 1 ;

            for( int r  = 1 ; r < row ; r++)
            {
                if ( obstacleGrid[r][0] == 0 && obstacleGrid[r-1][0] == 1)
                {
                    obstacleGrid[r][0] = 1;
                }
                else
                {
                    obstacleGrid[r][0] = 0;
                }
            }

            for( int c  = 1 ; c < col ; c++)
            {
                if ( obstacleGrid[0][c] == 0 && obstacleGrid[0][c-1] == 1)
                {
                    obstacleGrid[0][c] = 1;
                }
                else
                {
                    obstacleGrid[0][c] = 0;
                }
            }

            for(int r = 1 ; r < row ; r++)
            {
                for(int c = 1 ; c < col ; c++)
                {
                    if ( obstacleGrid[r][c] == 0)
                    obstacleGrid[r][c] = obstacleGrid[r-1][c] + obstacleGrid[r][c-1];
                    else
                        obstacleGrid[r][c] = 0;
                }
            }


            return obstacleGrid[row-1][col-1];


        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}