package com.vkstech.leetcode.algorithms.arrays.medium;

import java.util.Arrays;

/**
 * 1637. Widest Vertical Area Between Two Points Containing No Points
 */
public class WidestVerticalArea {

    public static int maxWidthOfVerticalArea(int[][] points) {
        int n = points.length;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = points[i][0];
        }
        Arrays.sort(arr);

        int diff = 0;
        int maxDiff = 0;
        for (int i = 1; i < n; i++) {
            diff = arr[i] - arr[i - 1];
            if (diff > maxDiff) {
                maxDiff = diff;
            }
        }

        return maxDiff;
    }

    public static void main(String[] args) {
        int[][] points = {{3, 1}, {9, 0}, {1, 0}, {1, 4}, {5, 3}, {8, 8}};
        int result = maxWidthOfVerticalArea(points);
        System.out.println(result);
    }
}
