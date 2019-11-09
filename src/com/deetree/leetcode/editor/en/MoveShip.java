package com.deetree.leetcode.editor.en;

import java.util.LinkedList;
import java.util.Queue;

public class MoveShip {

    public static void main(String[] args) {
        int[][] arr = {
                {1, 1, 0, 1},
                {0, 1, 1, 1},
                {1, 1, 1, 1}
        };


        MoveShip ship = new MoveShip();
        System.out.println(ship.Move(arr, 0, 0, 2, 2));
    }

    private boolean Move(int[][] arr, int si, int sj, int ei, int ej)
        {
            if ( arr.length <= 0 || arr[0].length <=0 )
                return false;

            Queue<Coordinate> queue = new LinkedList<>();
            queue.add(new Coordinate(si, sj));
            boolean[][] visited = new boolean[arr.length][arr[0].length];
            visited[0][0] = true;
            int[][] directions = new int[][]{
                    {1, 0}, {0, 1}, {-1, 0}, {0, -1}
            };


            while (!queue.isEmpty()) {
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    Coordinate coordinate = queue.poll();

                    assert coordinate != null;
                    int x = coordinate.x;
                    int y = coordinate.y;

                    if (x == ei && y == ej)
                        return true;


                    for (int[] dir : directions) {
                        int newX = x + dir[0];
                        int newY = y + dir[1];

                        if (newX >= 0 && newX < arr.length && newY >= 0 && newY < arr[0].length &&
                                arr[newX][newY] != 0 && !visited[newX][newY]) {
                            queue.add(new Coordinate(newX, newY));
                            visited[newX][newY] = true;
                        }
                    }
                }

                //return false;

            }


           return false;
        }

}

class Coordinate {
    int x;
    int y;

    Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
