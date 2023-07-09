package com.vkstech.leetcode.algorithms.arrays.easy;

public class NumberOfGoodPairs {

    public static int numIdenticalPairs1(int[] nums) {
        int res = 0;
        int[] count = new int[101];
        for (int a : nums) {
            res += count[a]++;
        }
        return res;
    }

    public static int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int j = 0; j < nums.length; j++) {
            for (int i = 0; i < j; i++) {
                if (nums[i] == nums[j])
                    count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] input = new int[]{1, 2, 303, 1, 1, 3};
        System.out.println(numIdenticalPairs(input));
    }
}
