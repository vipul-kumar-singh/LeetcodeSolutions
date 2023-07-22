package com.vkstech.leetcode.algorithms.arrays.medium;

import java.util.Arrays;

public class PointsInsideCircle {

    public static int[] countPoints(int[][] points, int[][] queries) {
        int[] count = new int[queries.length];

        int i = 0;
        for (int[] query : queries) {
            int x0 = query[0], y0 = query[1], r = query[2];
            for (int[] point : points) {
                int x1 = point[0], y1 = point[1];
                int dx = x1 - x0;
                int dy = y1 - y0;
                if (sqr(dx) + sqr(dy) <= sqr(r)) {
                    ++count[i];
                }
            }
            ++i;
        }

        return count;
    }

    private static int sqr(int a) {
        return a * a;
    }

    public static void main(String[] args) {
        int[][] points = {{1, 3}, {3, 3}, {5, 3}, {2, 2}};
        int[][] queries = {{2, 3, 1}, {4, 3, 1}, {1, 1, 2}};
        int[] count = countPoints(points, queries);
        System.out.println(Arrays.toString(count));
    }
}
