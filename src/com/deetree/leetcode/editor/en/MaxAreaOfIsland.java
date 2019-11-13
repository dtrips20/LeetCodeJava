//Given a non-empty 2D array grid of 0's and 1's, an island is a group of 1's (representing land) connected 4-directionally (horizontal or vertical.) You may assume all four edges of the grid are surrounded by water.
//
// Find the maximum area of an island in the given 2D array. (If there is no island, the maximum area is 0.) 
//
// Example 1: 
//
// 
//[[0,0,1,0,0,0,0,1,0,0,0,0,0],
// [0,0,0,0,0,0,0,1,1,1,0,0,0],
// [0,1,1,0,1,0,0,0,0,0,0,0,0],
// [0,1,0,0,1,1,0,0,1,0,1,0,0],
// [0,1,0,0,1,1,0,0,1,1,1,0,0],
// [0,0,0,0,0,0,0,0,0,0,1,0,0],
// [0,0,0,0,0,0,0,1,1,1,0,0,0],
// [0,0,0,0,0,0,0,1,1,0,0,0,0]]
// 
//Given the above grid, return 6. Note the answer is not 11, because the island must be connected 4-directionally.
//
// Example 2: 
//
// 
//[[0,0,0,0,0,0,0,0]] 
//Given the above grid, return 0.
//
// Note: The length of each dimension in the given grid does not exceed 50. 
// Related Topics Array Depth-first Search

package com.deetree.leetcode.editor.en;


public class MaxAreaOfIsland {
    public static void main(String[] args) {
        Solution solution = new MaxAreaOfIsland().new Solution();
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
         int[][] grid;
         boolean[][] seen;

        public int maxAreaOfIsland(int[][] grid) {

            int ans = 0 ;
            seen = new boolean[grid.length][grid[0].length];

            for( int i = 0 ; i <= grid.length-1 ; i++)
            {
                for( int j = 0 ; j < grid[0].length ; j++)
                {
                    ans = Math.max(ans,calculateArea(grid,i,j));
                }
            }

            return ans;
        }

        public int calculateArea(int[][] grid , int r , int c )
        {
            if ( r < 0 || r >= grid.length || c < 0 || c >= grid[0].length || seen[r][c] || grid[r][c] == 0)
                return 0;

            seen[r][c] = true;

            return ( 1 +
                    calculateArea( grid , r+1,c) +
                    calculateArea( grid , r,c+1) +
                    calculateArea( grid , r-1,c) +
                    calculateArea( grid , r,c-1)

                    );

        }


    }
//leetcode submit region end(Prohibit modification and deletion)

}