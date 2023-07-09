package com.vkstech.leetcode.algorithms.arrays.easy;

import java.util.Arrays;

public class SmallerThanCurrent {

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] newArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int num : nums) {
                if (nums[i] > num) {
                    newArray[i]++;
                }
            }
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] nums = {8, 1, 2, 2, 3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }
}
