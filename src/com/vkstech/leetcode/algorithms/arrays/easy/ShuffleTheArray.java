package com.vkstech.leetcode.algorithms.arrays.easy;

import java.util.Arrays;

public class ShuffleTheArray {

    public static int[] shuffle(int[] nums, int n) {
        int[] newNums = new int[2 * n];
        for (int i = 0; i < n; i++) {
            newNums[2 * i] = nums[i];
            newNums[2 * i + 1] = nums[n + i];
        }
        return newNums;
    }

    public static void main(String[] args) {
        int[] input = new int[]{2, 5, 1, 3, 4, 7};
        int mid = input.length / 2;
        System.out.println(Arrays.toString(shuffle(input, mid)));
    }
}
