package com.vkstech.leetcode.algorithms.arrays.medium;

import java.util.Arrays;

/**
 * 2149. Rearrange Array Elements by Sign
 */
public class RearrangeArrayBySign {

    public static int[] rearrangeArray(int[] nums) {
        int p = 0;
        int n = 1;

        int[] res = new int[nums.length];

        for (int num : nums) {
            if (num >= 0) {
                res[p] = num;
                p += 2;
            } else {
                res[n] = num;
                n += 2;
            }
        }

        return res;
    }

    public static void main(String[] args) {
//        int[] nums = {3, 1, -2, -5, 2, -4};
        int[] nums = {28, -41, 22, -8, -37, 46, 35, -9, 18, -6, 19, -26, -37, -10, -9, 15, 14, 31};
        int[] result = rearrangeArray(nums);

        System.out.println(Arrays.toString(result));
    }
}
