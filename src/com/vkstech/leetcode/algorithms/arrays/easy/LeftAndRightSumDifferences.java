package com.vkstech.leetcode.algorithms.arrays.easy;

import java.util.Arrays;

public class LeftAndRightSumDifferences {

    public static int[] leftRightDifference(int[] nums) {
        int[] arr = new int[nums.length];
        int leftSum = 0;
        int rightSum = Arrays.stream(nums).sum(); //25

        for (int i = 0; i < arr.length; i++) {
            rightSum -= nums[i];
            arr[i] = Math.abs(rightSum - leftSum);
            leftSum += nums[i];
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] nums = {10, 4, 8, 3};
        int[] ans = leftRightDifference(nums);
        System.out.println(Arrays.toString(ans));
    }
}
