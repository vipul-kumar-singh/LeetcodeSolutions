package com.vkstech.leetcode.algorithms.arrays.easy;

import java.util.Arrays;

public class DecompressRunLengthEncodedList {

    public static int[] decompressRLElist(int[] nums) {
        int size = 0;
        for (int i = 0; i < nums.length; i += 2) {
            size += nums[i];
        }

        int[] newNums = new int[size];
        int startIdx = 0;
        for (int i = 0; i < nums.length; i += 2) {
            Arrays.fill(newNums, startIdx, startIdx + nums[i], nums[i + 1]);
            startIdx += nums[i];
        }
        return newNums;
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4};
        System.out.println(Arrays.toString(decompressRLElist(input)));
    }
}
