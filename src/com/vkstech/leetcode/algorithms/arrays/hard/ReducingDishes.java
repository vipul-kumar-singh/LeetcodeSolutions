package com.vkstech.leetcode.algorithms.arrays.hard;

import java.util.Arrays;

/**
 * 1402. Reducing Dishes
 */
public class ReducingDishes {

    public static int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int n = satisfaction.length;
        int presum = 0, res = 0;
        for (int i = n - 1; i >= 0; i--) {
            presum += satisfaction[i];
            if (presum < 0) {
                break;
            }
            res += presum;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] satisfaction = {-1, -8, 0, 5, -9};
        int result = maxSatisfaction(satisfaction);
        System.out.println(result);
    }
}
