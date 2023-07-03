package com.vkstech.leetcode.algorithms.easy.arrays;

import java.util.Arrays;

public class BuildArrayFromPermutation {

    public static int[] buildArray(int[] nums) {
//        int[] ans = new int[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            ans[i] = nums[nums[i]];
//        }
//        return ans;

        return Arrays.stream(nums).map(num -> nums[num]).toArray();
    }

    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
        int[] ans =  buildArray(nums);
        ArrayUtils.printArr(ans);
    }
}
