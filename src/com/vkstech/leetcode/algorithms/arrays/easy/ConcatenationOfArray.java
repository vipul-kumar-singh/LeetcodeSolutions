package com.vkstech.leetcode.algorithms.arrays.easy;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ConcatenationOfArray {

    public static int[] getConcatenation(int[] nums) {
        int[] arr = new int[nums.length * 2];
        IntStream.range(0, nums.length).forEach(i -> arr[i] = arr[i + nums.length] = nums[i]);
        return arr;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        int[] ans = getConcatenation(nums);
        System.out.println(Arrays.toString(ans));
    }
}
